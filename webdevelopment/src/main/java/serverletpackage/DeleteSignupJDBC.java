package serverletpackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteRow")
public class DeleteSignupJDBC extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String delsid = req.getParameter("id");

		List<SignupData> result = new ArrayList<SignupData>();

		try {

			// Step 1 - Load the driver

			Class.forName("com.mysql.jdbc.Driver");

			// Step 2 - Creating the connection to the database
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_tutorial_db", "root",
					"root@123");

			// Step 3 - Creating delete query
			String delsql = "delete from signup_tbl where id = ?";

			// Step 4 - Compiling the query and wrapping inside the object
			PreparedStatement pstmt = null;
			pstmt = conn.prepareStatement(delsql);

			pstmt.setInt(1, Integer.parseInt(delsid));

			pstmt.executeUpdate();

			String sql = "select id, first_name, last_name, gender, email_address, password from signup_tbl";

			// Step 4 - Compiling the query and wrapping inside the object
			pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				SignupData signupdata = new SignupData(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6));
				result.add(signupdata);

			}

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		req.setAttribute("data", result);

		req.getRequestDispatcher("searchlistJDBC.jsp").forward(req, resp);

	}

}
