package model;

public class Account {
	private int accountNo ;
	private float balance ;
	private int customerId ;
	private int branchId ;
	private String openingDate ;
	private String type ;
	
	public int getAccountNo() {
		return accountNo;
	}
	public float getBalance() {
		return balance;
	}
	public int getCustomerId() {
		return customerId;
	}
	public int getBranchId() {
		return branchId;
	}
	public String getOpeningDate() {
		return openingDate;
	}
	public String getType() {
		return type;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", balance=" + balance + ", customerId=" + customerId + ", branchId="
				+ branchId + ", openingDate=" + openingDate + ", type=" + type + "]";
	}
	
}
