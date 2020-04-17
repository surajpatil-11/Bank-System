package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Account;
import model.Customer;
import service.CustomerRegistrationService;

@WebServlet("/AccountController")
public class AccountController extends HttpServlet {
private static final long serialVersionUID = 1L;
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int accountNo = Integer.parseInt(request.getParameter("AccountNo"));
			int balance = Integer.parseInt(request.getParameter("balance"));
			int customerId = Integer.parseInt(request.getParameter("customerId"));
			int branchId = Integer.parseInt(request.getParameter("branchId"));
			String openingDate = request.getParameter("openingDate");
			String type = request.getParameter("type");
			
			Account account = new Account(); 
		    
		    account.setAccountNo(accountNo);
		    account.setBalance(balance) ;
			account.setCustomerId(customerId);
			account.setBranchId(branchId) ;
			account.setOpeningDate(openingDate);
			account.setType(type);
		    
		    
		    //CustomerRegistrationService.register(customer);
		    
		   System.out.println(account);
			response.sendRedirect("login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
