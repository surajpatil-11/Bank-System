package model;

public class Transaction {
	private int transactionId ;
	private int accountNo ;
	private String date ;
	private float deposite ;
	private float withdraw ;
	private String description ;
	
	public String getDescription() {
		return description;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getDate() {
		return date;
	}
	public float getDeposite() {
		return deposite;
	}
	public float getWithdraw() {
		return withdraw;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setDeposite(float deposite) {
		this.deposite = deposite;
	}
	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accountNo=" + accountNo + ", date=" + date
				+ ", deposite=" + deposite + ", withdraw=" + withdraw + ", description=" + description + "]";
	}
}
