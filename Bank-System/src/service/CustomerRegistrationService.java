package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Customer;
import model.User;



public class CustomerRegistrationService {
	private static String url = "jdbc:mysql://localhost:3306/bank" ;
	private static String uname = "root" ;
	private static String pass = "hesoyam@123" ;
	
	public static void register(Customer customer) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass) ;
			System.out.println("ok");
			String sql = "INSERT INTO customer(first_name,middle_name,last_name,gender,house_no,street,city,state,country,pincode,mobile,data_of_birth,occupation,pan_no,aadhar_no,income_per_annum,balance,type,interest  ) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" ;
			PreparedStatement ps = con.prepareStatement(sql) ;
			ps.setString(1 , customer.getFirstName() );
			ps.setString(2 , customer.getMiddleName() );
			ps.setString(3 , customer.getLastName() );
			ps.setString(4 , customer.getGender() );
			ps.setString(5 , customer.getHouseNo() );
			ps.setString(6 , customer.getStreet() );
			ps.setString(7 , customer.getCity() );
			ps.setString(8 , customer.getState() );
			ps.setString(9 , customer.getCountry() );
			ps.setString(10 , customer.getPincode() );
			ps.setString(11 , customer.getMobile() );
			ps.setString(12 , customer.getDataOfBirth() );
			ps.setString(13 , customer.getOccupation() );
			ps.setString(14 , customer.getPanNo() );
			ps.setString(15 , customer.getAadhar()  );
			ps.setFloat(16 , customer.getIncomePerAnnum() );
			ps.setFloat(17,customer.getBalance());
			ps.setString(18, customer.getType());
			ps.setFloat(19,customer.getInterest() );
			ps.executeUpdate();		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
