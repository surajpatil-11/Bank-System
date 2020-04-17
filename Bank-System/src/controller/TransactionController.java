package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Transaction;
import service.TransactionService;


@WebServlet("/TransactionController")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int accountNo = Integer.parseInt(request.getParameter("accountNo"));
			String date = request.getParameter("date");
			float deposite = Float.parseFloat(request.getParameter("deposite"));
			float withdraw = Float.parseFloat( request.getParameter("withdraw"));
			String description = request.getParameter("description");
			
			Transaction transaction = new Transaction() ;
			transaction.setAccountNo(accountNo);
			transaction.setDate(date);
			transaction.setWithdraw(withdraw);
			transaction.setDeposite(deposite);
			transaction.setDescription(description);
			System.out.println(transaction);
			TransactionService.register(transaction);
			response.sendRedirect("login.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
