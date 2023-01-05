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
@WebServlet("/updateJDBCServlet")
public class UpdateSignupJDBCServlet extends HttpServlet {
	@Override

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// read form fields
		String id = req.getParameter("id");
		String firstname = req.getParameter("first_name");
		String lastname = req.getParameter("last_name");
		String gender = req.getParameter("gender");
		// String email = request.getParameter("email"); Not required because email is not updated
		String password = req.getParameter("password");

		
		// Write JDBC programming to save the data in database.
		//Always write try catch for the JDBC connection
		
		try {
			// Step 1 - Load the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			// Step 2 - Creating the connection to the database
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_tutorial_db", "root", "root@123");
			
			// Step 3 - Creating update query
			String sql = "Update signup_tbl set first_name = ?, last_name = ?, gender = ?, password = ? where id = ?";
			
			// Step 4 - Compiling the query and wrapping inside the object
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// Step 5 - Setting the values inside the placeholder
			pstmt.setString(1, firstname);
			pstmt.setString(2, lastname);
			pstmt.setString(3, gender);
			pstmt.setString(4, password);
			pstmt.setInt(5, Integer.parseInt(id));
			
			// Step 6 -  Fire the Query
			pstmt.executeUpdate();
					
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}

		req.setAttribute("message", "You have successfully updated your record!");
		req.getRequestDispatcher("signuplistJDBC").forward(req, resp);

	}

}
