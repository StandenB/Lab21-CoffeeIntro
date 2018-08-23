package co.grandcircus.coffeeshop;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDao3 {
	
	@PersistenceContext
	EntityManager em;

	@Autowired   
	// private JdbcTemplate jdbcTemplate;
	
	public List<User> findAll() {
//		String sql = "SELECT * FROM users";
//		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
		return em.createQuery("FROM User", User.class).getResultList();
	}
	
//	public void create(User user) {
//		String sql = "INSERT INTO users (firstName, lastName, emailAddress, optinStatus, "
//				+ "phoneNumber, caffeine, race, password, passwordMatch) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
//		jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), 
//				user.getEmailAddress(), user.isOptinStatus(), user.getPhoneNumber(), 
//				user.isCaffeine(), user.getRace(), user.getPassword(), user.getPasswordMatch());
	public void create(User user) {
		em.persist(user);
	}
	public void update(User user) {
		em.merge(user);
	}
	public void delete(Long id) {
		User userToDelete = em.getReference(User.class, id);
		em.remove(userToDelete);
	}
	public User findbyId(Long id) {
		return em.find(User.class, id);
	}
}
