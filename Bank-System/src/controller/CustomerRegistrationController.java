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
			String educationalQualification = request.getParameter("educationalQualification");
			
			// firstName middleName lastName gender houseNo street city state country pincode mobile dateOfBirth 
			// occupation panNo aadharNo incomePerAnnum educationalQualification
			// System.out.println(username+" "+password+" "  + email + " "+mobile);
			//PrintWriter out = response.getWriter();
			// out.println(username+" "+password+" "+email+" "+mobile);
//			String rad = request.getParameter("gender") ;
//			System.out.println(rad);
//			User user = new User() ;
//			user.setUsername(username); 
//			user.setPassword(password);
//			user.setMobile(mobile);
//			user.setEmail(email);
//			RegisterService.register(user);
			Customer customer = new Customer(); 
		    System.out.println(firstName);
		    System.out.println(middleName);
		    System.out.println(lastName);
		    System.out.println(gender);
		    
		    System.out.println(houseNo);
		    System.out.println(street);
		    System.out.println(city);
		    System.out.println(pincode);
		    
		    System.out.println(mobile);
		    System.out.println(dateOfBirth);
		    System.out.println(occupation);
		    System.out.println(panNo);
		    System.out.println(aadharNo);
		    System.out.println(incomePerAnnum );
		    System.out.println(educationalQualification);
		    System.out.println();
		    
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
		    customer.setDataOBirth(dateOfBirth) ;
		    customer.setOccupation(occupation) ;
		    customer.setPanNo(panNo) ;
		    customer.setAadhar(aadharNo) ;
		    customer.setIncomePerAnnum(incomePerAnnum) ;
		    customer.setEducationalQualification(educationalQualification) ;
		    
		    CustomerRegistrationService.register(customer);
		    
		    System.out.println(customer);
			response.sendRedirect("login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
