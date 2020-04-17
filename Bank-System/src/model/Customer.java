package model;

public class Customer {
	// firstName middleName lastName gender houseNo street city state country pincode mobile dateOfBirth 
	// occupation panNo aadharNo incomePerAnnum educationalQualification
	private String firstName ;
	private String middleName ;
	private String lastName ;
	private String gender ;
	private String houseNo ;
	private String street ;
	private String city ;
	private String state ;
	private String country ;
	private String pincode ;
	private String mobile ;
	private String dataOfBirth ;
	private String occupation ;
	private String panNo ;
	private String aadhar ;
	private float incomePerAnnum ;
	private float balance ;
	private float interest ;
	private String type ;
	
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getPincode() {
		return pincode;
	}
	public String getMobile() {
		return mobile;
	}
	public String getDataOfBirth() {
		return dataOfBirth;
	}
	public String getOccupation() {
		return occupation;
	}
	public String getPanNo() {
		return panNo;
	}
	public String getAadhar() {
		return aadhar;
	}
	public float getIncomePerAnnum() {
		return incomePerAnnum;
	}
	public float getBalance() {
		return balance;
	}
	public float getInterest() {
		return interest;
	}
	public String getType() {
		return type;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setDataOfBirth(String dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public void setIncomePerAnnum(float incomePerAnnum) {
		this.incomePerAnnum = incomePerAnnum;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", gender=" + gender + ", houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", state="
				+ state + ", country=" + country + ", pincode=" + pincode + ", mobile=" + mobile + ", dataOfBirth="
				+ dataOfBirth + ", occupation=" + occupation + ", panNo=" + panNo + ", aadhar=" + aadhar
				+ ", incomePerAnnum=" + incomePerAnnum + ", balance=" + balance + ", interest=" + interest + ", type="
				+ type + "]";
	}
	
}
