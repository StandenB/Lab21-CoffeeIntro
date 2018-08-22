package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao3 {

	@Autowired   // Dependency Injection
	private JdbcTemplate jdbcTemplate;
	
	public List<User> findAll() {
		String sql = "SELECT * FROM users";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
	}
	
	public void create(User user) {
		String sql = "INSERT INTO users (firstName, lastName, emailAddress, optinStatus, "
				+ "phoneNumber, caffeine, race, password, passwordMatch) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), 
				user.getEmailAddress(), user.isOptinStatus(), user.getPhoneNumber(), 
				user.isCaffeine(), user.getRace(), user.getPassword(), user.getPasswordMatch());
	}
	
}
