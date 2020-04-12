package model;

public class Loan {
	private int loanId ;
	private int accountNo ;
	private float amount ;
	private String issuedBy ;
	private String date ;
	private float interest ;
	
	public int getLoanId() {
		return loanId;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public float getAmount() {
		return amount;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public String getDate() {
		return date;
	}
	public float getInterest() {
		return interest;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", accountNo=" + accountNo + ", amount=" + amount + ", issuedBy=" + issuedBy
				+ ", date=" + date + ", interest=" + interest + "]";
	}
	
	

}
