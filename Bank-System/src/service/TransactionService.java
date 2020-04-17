package service;

import java.sql.*;

import model.Transaction;

public class TransactionService {
	private static String url = "jdbc:mysql://localhost:3306/bank";
	private static String uname = "root";
	private static String pass = "hesoyam@123";

	public static boolean isAccountExist(int accountNo) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			Statement st = con.createStatement();
			String sql = "SELECT account_no FROM customer where account_no=" + accountNo;
			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void register(Transaction transaction) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			System.out.println("ok");

			if (!isAccountExist(transaction.getAccountNo())) {
				return;
			}
			System.out.println("ok passed");

			/**
			 * Update transaction in transaction table.
			 */
			String sql = "INSERT INTO transaction(account_no,date,deposite,withdraw,description) value(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setFloat(1, transaction.getAccountNo());
			ps.setString(2, transaction.getDate());
			ps.setFloat(3, transaction.getDeposite());
			ps.setFloat(4, transaction.getWithdraw());
			ps.setString(5, transaction.getDescription());
			ps.executeUpdate();

			Statement st = con.createStatement();
			sql = "SELECT balance FROM customer where account_no=" + transaction.getAccountNo();
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			float balance = rs.getFloat(1);

			if (transaction.getDeposite() > 0) {

				balance += transaction.getDeposite();
				sql = "UPDATE customer SET balance=" + balance + " WHERE account_no=" + transaction.getAccountNo();
				st.executeUpdate(sql);
			}
			if (transaction.getWithdraw() > 0) {
				if (balance >= transaction.getWithdraw()) {
					balance -= transaction.getWithdraw();
					sql = "UPDATE customer SET balance=" + balance + " WHERE account_no=" + transaction.getAccountNo();
					st.executeUpdate(sql);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
