package serverletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // read form fields
        String username = request.getParameter("username");
        String password = request.getParameter("password");
         
        if ("jack".equalsIgnoreCase(username) && "jill".equalsIgnoreCase(password)) {
        	request.getRequestDispatcher("success_login.html").forward(request, response);
        }else {
        	request.getRequestDispatcher("fail_login.html").forward(request, response);
        }
	}

}
