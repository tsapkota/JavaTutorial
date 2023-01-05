package serverletpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/signupJDBCServlet")
public class SignupJDBCServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// read form fields
		String firstname = request.getParameter("first_name");
		String lastname = request.getParameter("last_name");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		SignupData signup = new SignupData(firstname, lastname, gender, email, password);
		
		// Write JDBC programming to save the data in database.
		//Always write try catch for the JDBC connection
		
		try {
			// Step 1 - Load the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			// Step 2 - Creating the connection to the database
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_tutorial_db", "root", "root@123");
			
			// Step 3 - Creating insert query
			String sql = "insert into signup_tbl (first_name, last_name, gender, email_address, password) values (?, ?, ?, ?, ?)";
			
			// Step 4 - Compiling the query and wrapping inside the object
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// Step 5 - Setting the values inside the placeholder
			pstmt.setString(1, firstname);
			pstmt.setString(2, lastname);
			pstmt.setString(3, gender);
			pstmt.setString(4, email);
			pstmt.setString(5, password);
			
			// Step 6 -  Fire the Query
			pstmt.executeUpdate();
			
			System.out.println("Data is inserted.");			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}

		request.setAttribute("message", "You have successfully registered with us " + firstname + "!");
		request.getRequestDispatcher("success_signup.jsp").forward(request, response);

	}

}
