package controller;

import domain.User;
import service.UserService;
import serviceimpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserLoginController {
    private static final long serialVersionUID = 1L;

    private UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get the registration detail from user registration form
        // populate the user model
        String loginname = request.getParameter("loginname");
        String password = request.getParameter("password");
        // call service method and pass user model
        User user = userService.authenticateUser(loginname, password);
        // redirect to the success page
        if(user != null)
            request.getServletContext().getRequestDispatcher("/userdashboard.jsp?msg=User login successfully!").forward(request, response);
        //response.sendRedirect("./userdashboard.jsp?msg=User Registered successfully!");
    }
}
