package co.grandcircus.coffeeshop;

import org.springframework.web.bind.annotation.RequestParam;

public class User {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private boolean optinStatus;
	private String phoneNumber;
	private boolean caffeine;
	private String race;
	private String password;
	private String passwordMatch;
	
	public User() {}
	
	public User(String firstName, String lastName, String emailAddress, boolean optinStatus,
			String phoneNumber, boolean caffeine, String race, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.optinStatus = optinStatus;
		this.phoneNumber = phoneNumber;
		this.caffeine = caffeine;
		this.race = race;
		this.password = password;
		this.passwordMatch = passwordMatch;
	}

	

	public boolean isCaffeine() {
		return caffeine;
	}

	public void setCaffeine(boolean caffeine) {
		this.caffeine = caffeine;
	}

	public boolean isOptinStatus() {
		return optinStatus;
	}

	public void setOptinStatus(boolean optinStatus) {
		this.optinStatus = optinStatus;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPasswordMatch() {
		return passwordMatch;
	}

	public void setPasswordMatch(String passwordMatch) {
		this.passwordMatch = passwordMatch;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress
				+ ", phoneNumber=" + phoneNumber + ", password=" + password + "]";
	}

	
}
