package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerRegistrationService;

@WebServlet("/CustomerRegistrationController")
public class CustomerRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			System.out.println("ok");
			String firstName = request.getParameter("firstName");
			String middleName = request.getParameter("middleName");
			String lastName = request.getParameter("lastName");
			String gender = request.getParameter("gender");
			String houseNo = request.getParameter("houseNo");
			String street = request.getParameter("street");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String country = request.getParameter("country");
			String pincode = request.getParameter("pincode");
			String mobile = request.getParameter("mobile");
			String dateOfBirth = request.getParameter("dateOfBirth");
			String occupation = request.getParameter("occupation");
			String panNo = request.getParameter("panNo");
			String aadharNo = request.getParameter("aadharNo");
			float incomePerAnnum = Float.parseFloat(request.getParameter("incomePerAnnum"));
			float balance = Float.parseFloat(request.getParameter("balance"));
			float interest = Float.parseFloat(request.getParameter("interest"));
			String type = request.getParameter("type");
			
			Customer customer = new Customer();     
		    customer.setFirstName(firstName) ;
		    customer.setMiddleName(middleName) ;
		    customer.setLastName(lastName) ;
		    customer.setGender(gender) ;
		    customer.setHouseNo(houseNo) ;
		    customer.setStreet(street) ;
		    customer.setCity(city) ;
		    customer.setState(state) ;
		    customer.setCountry(country) ;
		    customer.setPincode(pincode) ;
		    customer.setMobile(mobile) ;
		    customer.setDataOfBirth(dateOfBirth) ;
		    customer.setOccupation(occupation) ;
		    customer.setPanNo(panNo) ;
		    customer.setAadhar(aadharNo) ;
		    customer.setIncomePerAnnum(incomePerAnnum) ;
		    customer.setBalance(balance);
		    customer.setInterest(interest);
		    customer.setType(type);
		         
		   
		    System.out.println(customer);
		    CustomerRegistrationService.register(customer);
			response.sendRedirect("login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
