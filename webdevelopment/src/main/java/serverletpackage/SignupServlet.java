package serverletpackage;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	
	private List <SignupData> signuplist = new ArrayList<SignupData>();
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // read form fields
        String firstname = request.getParameter("first_name");
        String lastname = request.getParameter("last_name");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
         
        SignupData signup = new SignupData(firstname, lastname, gender, email, password);
        
        boolean addFLag = true;
        for (SignupData data : signuplist) {
        	if (data.getEmail().equals(email)) {
        		addFLag = false;
        		break;
        	}
        }
        
        if (addFLag) {
        signuplist.add(signup);
        request.setAttribute("message", "Your data is successfully added.");
        }else {
        	
        	request.setAttribute("message", "Duplicate data exists.");
        
        }
        request.setAttribute("data", signuplist);
        request.getRequestDispatcher("signuplist.jsp").forward(request, response);
        
       	}

}
