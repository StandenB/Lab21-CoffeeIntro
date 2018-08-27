package co.grandcircus.coffeeshop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestParam;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idusers;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email_address")
	private String emailAddress;
	@Column(name="optin_status", columnDefinition="TINYINT(1)")
	private boolean optinStatus;
	@Column(name="phone_number")
	private String phoneNumber;
	@Column(name="caffeine", columnDefinition="TINYINT(1)")
	private boolean caffeine;
	@Column(name="race")
	private String race;
	@Column(name="password")
	private String password;
	@Column(name="password_match")
	private String passwordMatch;
	
	public User() {}
	
	public User(Long idusers, String firstName, String lastName, String emailAddress, boolean optinStatus,
			String phoneNumber, boolean caffeine, String race, String password) {
		super();
		this.idusers = idusers;
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

	

	public Long getIdusers() {
		return idusers;
	}

	public void setIdusers(Long idusers) {
		this.idusers = idusers;
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
