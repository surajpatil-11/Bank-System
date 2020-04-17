package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import model.Employee;
import service.EmployeeRegistrationService;

@WebServlet("/EmployeeRegistrationController")
public class EmployeeRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			System.out.println("ok");
			String branch = request.getParameter("branch");
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
			String post = request.getParameter("post");
			String panNo = request.getParameter("panNo");
			String aadharNo = request.getParameter("aadharNo");
			System.out.println("ok");
			float salary = Float.parseFloat(request.getParameter("salary"));
			
			Employee employee = new Employee(); 
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
		    //System.out.println(occupation);
		    System.out.println(panNo);
		    System.out.println(aadharNo);
		  //  System.out.println(incomePerAnnum );
		   
		    System.out.println();
		    
		    employee.setBranch(branch);
		    employee.setFirstName(firstName);
		    employee.setMiddleName(middleName);
		    employee.setLastName(lastName);
		    employee.setGender(gender);
		    employee.setHouseNo(houseNo);
		    employee.setStreet(street);
		    employee.setCity(city);
		    employee.setState(state);
		    employee.setCountry(country);
		    employee.setPincode(pincode);
		    employee.setMobile(mobile);
		    employee.setDateOfBirth(dateOfBirth);
		    employee.setPost(post);
		    employee.setSalary(salary);
		    employee.setAadharNo(aadharNo);
		    employee.setPanNo(panNo);
		         
		    System.out.println(employee);
		    EmployeeRegistrationService.register(employee);
			response.sendRedirect("login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
