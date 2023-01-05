package serverletpackage;

public class SignupData {
	private int id;
private String firstname;
private String lastname;
private String gender;
private String email;
private String password;



public SignupData(int id, String firstname, String lastname, String gender, String email, String password) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.gender = gender;
	this.email = email;
	this.password = password;
}


public SignupData(String firstname, String lastname, String gender, String email, String password) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.gender = gender;
	this.email = email;
	this.password = password;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "SignupData [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", email=" + email
			+ ", password=" + password + "]";
}


}
