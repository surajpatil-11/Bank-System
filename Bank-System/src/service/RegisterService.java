package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.User;

public class RegisterService {
	
	private static String url = "jdbc:mysql://localhost:3306/rough" ;
	private static String uname = "root" ;
	private static String pass = "hesoyam@123" ;
	
	public static void register(User user) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass) ;
			
			String sql = "insert into user (username,password,email,mobile) value (?,?,?,?)" ;
			PreparedStatement ps = con.prepareStatement(sql) ;
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getMobile());
			ps.executeUpdate();		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
