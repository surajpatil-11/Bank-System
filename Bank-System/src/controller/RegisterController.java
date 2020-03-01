package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.RegisterService;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("passowrd");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			// System.out.println(username+" "+password+" "  + email + " "+mobile);
			//PrintWriter out = response.getWriter();
			// out.println(username+" "+password+" "+email+" "+mobile);
			
			User user = new User() ;
			user.setUsername(username); 
			user.setPassword(password);
			user.setMobile(mobile) ;
			user.setEmail(email);
			RegisterService.register(user);
			
			
			response.sendRedirect("login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
