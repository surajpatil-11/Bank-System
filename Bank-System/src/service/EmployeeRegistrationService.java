package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Customer;
import model.Employee;
import model.User;

public class EmployeeRegistrationService {
	private static String url = "jdbc:mysql://localhost:3306/bank";
	private static String uname = "root";
	private static String pass = "hesoyam@123";

	public static void register(Employee employee) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			System.out.println("ok");
			String sql = "INSERT INTO employee(first_name,middle_name,last_name,gender,house_no,street,city,state,country,pincode,mobile,date_of_birth,post,salary,pan_no,aadhar_no  ) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getMiddleName());
			ps.setString(3, employee.getLastName());
			ps.setString(4, employee.getGender());
			ps.setString(5, employee.getHouseNo());
			ps.setString(6, employee.getStreet());
			ps.setString(7, employee.getCity());
			ps.setString(8, employee.getState());
			ps.setString(9, employee.getCountry());
			ps.setString(10, employee.getPincode());
			ps.setString(11, employee.getMobile());
			ps.setString(12, employee.getDateOfBirth());
			ps.setString(13, employee.getPost());
			ps.setFloat(14, employee.getSalary());
			ps.setString(15, employee.getPanNo());
			ps.setString(16, employee.getAadharNo());
			
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
