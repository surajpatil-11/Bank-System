package model;

public class Employee {
	private	int employeeId ;
	private String branch ;
	private	String firstName ;
	private	String middleName ;
	private	String lastName ;
	private	String gender ;
	private	String houseNo ;
	private	String street ;
	private	String city ;
	private	String state ;	  
	private	String country ;   
	private	String pincode ;	
	private	String mobile ;
	private	String dateOfBirth ;
	private String post ;
	private float salary ;
	private String aadharNo ;
	private String panNo ;
	public int getEmployeeId() {
		return employeeId;
	}
	public String getBranch() {
		return branch;
	}
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getPost() {
		return post;
	}
	public float getSalary() {
		return salary;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setBranch(String branch) {
		this.branch = branch;
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
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", branch=" + branch + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", gender=" + gender + ", houseNo="
				+ houseNo + ", street=" + street + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + ", mobile=" + mobile + ", dateOfBirth=" + dateOfBirth + ", post=" + post
				+ ", salary=" + salary + ", aadharNo=" + aadharNo + ", panNo=" + panNo + "]";
	}
	
}
