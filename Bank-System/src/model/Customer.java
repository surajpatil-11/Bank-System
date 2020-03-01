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
	private String dataOBirth ;
	private String occupation ;
	private String panNo ;
	private String aadhar ;
	private float incomePerAnnum ;
	private String educationalQualification ;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDataOBirth() {
		return dataOBirth;
	}
	public void setDataOBirth(String dataOBirth) {
		this.dataOBirth = dataOBirth;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public float getIncomePerAnnum() {
		return incomePerAnnum;
	}
	public void setIncomePerAnnum(float incomePerAnnum) {
		this.incomePerAnnum = incomePerAnnum;
	}
	public String getEducationalQualification() {
		return educationalQualification;
	}
	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", gender=" + gender + ", houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", state="
				+ state + ", country=" + country + ", pincode=" + pincode + ", mobile=" + mobile + ", dataOBirth="
				+ dataOBirth + ", occupation=" + occupation + ", panNo=" + panNo + ", aadhar=" + aadhar
				+ ", incomePerAnnum=" + incomePerAnnum + ", educationalQualification=" + educationalQualification + "]";
	}
	
}
