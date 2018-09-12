package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import service.UserService;
import serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class UserRegistrationController
 */
public class UserRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService userService = new UserServiceImpl();
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the registration detail from user registration form
		// populate the user model
		User user= new User();
		user.setFirstName(request.getParameter("firstname"));
		user.setLastName(request.getParameter("lastname"));
		user.setLoginName(request.getParameter("loginname"));
		user.setPassword(request.getParameter("password"));		
		
		// call service method and pass user model
		userService.registerUser(user);
		// redirect to the success page
		getServletContext().getRequestDispatcher("/userdashboard.jsp?msg=User Registered successfully!").forward(request, response);
		//response.sendRedirect("./userdashboard.jsp?msg=User Registered successfully!");
	}

}
