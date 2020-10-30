package logic;

public class Ven {

	private String firstname;
	private String lastname;
	private String dateOfBirth;
	private String email;
	private String city;
	private String phonenumber;
	private String car;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}	
	@Override
	public String toString() {
		return "Ven [firstname=" + firstname + ", lastname=" + lastname + ", dateOfBirth=" + dateOfBirth + ", email="
				+ email + ", city=" + city + ", phonenumber=" + phonenumber + ", car=" + car + "]";
}

}
