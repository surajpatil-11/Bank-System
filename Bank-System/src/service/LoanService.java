package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Loan;
import model.User;



public class LoanService {
	private static String url = "jdbc:mysql://localhost:3306/bank" ;
	private static String uname = "root" ;
	private static String pass = "root" ;
	
	public static void register(Loan loan) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass) ;
			
			String sql = "INSERT INTO loan( account_no,amount,issued_by,issued_date,interest   ) value(?,?,?,?,?)" ;
			PreparedStatement ps = con.prepareStatement(sql) ;
			ps.setInt(1 , loan.getAccountNo() );
			ps.setFloat(2 , loan.getAmount() );
			ps.setString(3 , loan.getIssuedBy() );
			ps.setString(4 , loan.getDate() );
			ps.setFloat(5 , loan.getInterest() );
			ps.executeUpdate();		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void dpayInsta(Loan loan) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass) ;

			String sql = "INSERT INTO loan( account_no,amount,issued_by,issued_date,interest   ) value(?,?,?,?,?)" ;
			PreparedStatement ps = con.prepareStatement(sql) ;
			ps.setInt(1 , loan.getAccountNo() );
			ps.setFloat(2 , loan.getAmount() );
			ps.setString(3 , loan.getIssuedBy() );
			ps.setString(4 , loan.getDate() );
			ps.setFloat(5 , loan.getInterest() ); 
			ps.executeUpdate();		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
