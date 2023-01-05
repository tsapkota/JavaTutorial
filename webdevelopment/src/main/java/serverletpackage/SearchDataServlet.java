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

@WebServlet("/searchData")
public class SearchDataServlet extends HttpServlet {



	@Override
	public void init() {
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String text = req.getParameter("searchText");
		List<SignupData> searchResults = new ArrayList<SignupData>();

		//List<SignupData> result = new ArrayList<SignupData>();

		try {
			// Step 1 - Load the driver

			Class.forName("com.mysql.jdbc.Driver");

			// Step 2 - Creating the connection to the database
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_tutorial_db", "root",
					"root@123");

			// Step 3 - Creating insert query
			String sql = "select id, first_name, last_name, gender, email_address, password from signup_tbl where first_name like ? or last_name like ? or email_address like ? or gender like ?";

			// Step 4 - Compiling the query and wrapping inside the object
			PreparedStatement pstmt = null;
			
			if(text == null || text.trim().length()==0) {
				sql = "select id, first_name, last_name, gender, email_address, password from signup_tbl";
				pstmt = conn.prepareStatement(sql);
			} else {
				pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, text);
			pstmt.setString(2, text);
			pstmt.setString(3, text);
			pstmt.setString(4, text);
			}
			
			
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				SignupData signupdata = new SignupData(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6));
				searchResults.add(signupdata);

			}

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		if (searchResults.size() == 0) {
			req.setAttribute("message", "No results found.");
		}
		req.setAttribute("data", searchResults);
		req.getRequestDispatcher("searchlist.jsp").forward(req, resp);

	}

}
