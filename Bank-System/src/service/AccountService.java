package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Customer;
import model.User;
import model.Account;


public class AccountService {
	
	private static String url = "jdbc:mysql://localhost:3306/bank" ;
	private static String uname = "root" ;
	private static String pass = "hesoyam@123" ;
	
	public static void register(Account account) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass) ;
			
			String sql = "INSERT INTO account(balance,customerId,branchId,openingDate,type) value(?,?,?,?,?)" ;
			PreparedStatement ps = con.prepareStatement(sql) ;
			ps.setFloat(1 , account.getBalance() );
			ps.setInt(2 , account.getCustomerId() );
			ps.setInt(3 , account.getBranchId() );
			ps.setString(4 , account.getOpeningDate() );
			ps.setString(5 , account.getType() );
			
			ps.executeUpdate();		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
