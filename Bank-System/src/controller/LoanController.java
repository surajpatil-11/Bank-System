package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Loan;
import service.LoanService;


@WebServlet("/LoanController")
public class LoanController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			System.out.println("OK2");
			int accountNo = Integer.parseInt(request.getParameter("accountNo"));
			System.out.println(accountNo);
			float amount = Float.parseFloat(request.getParameter("amount"));
			System.out.println(amount);
			String issuedBy = request.getParameter("issuedBy");
			System.out.println("OK");
			String date = request.getParameter("date");
			System.out.println(date);
			float interest = Float.parseFloat(request.getParameter("interest")); ;//= Float.parseFloat(request.getParameter("interest"));
			System.out.println(interest);


			Loan loan = new Loan();
			loan.setLoanId(1);
			loan.setAccountNo(accountNo);
			loan.setAmount(amount);
			loan.setIssuedBy(issuedBy);
			loan.setDate(date);
			loan.setInterest(interest);

			LoanService.register(loan);

			System.out.println(loan);
			response.sendRedirect("login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
