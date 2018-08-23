package co.grandcircus.coffeeshop;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ItemsDao3 {

	@PersistenceContext
	EntityManager em;
	
	@Autowired
	// private JdbcTemplate jdbcTemplate;
	
	public List<Items> findAll() {
//		String sql = "SELECT * FROM items";
//		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Items.class));
		return em.createQuery("FROM Items", Items.class).getResultList();
	}
	public void create(Items item) {
		em.persist(item);
	}
	public void update(Items item) {
		em.merge(item);
	}
	public void delete(Long id) {
		Items itemToDelete = em.getReference(Items.class, id);
		em.remove(itemToDelete);
	}
	public Items findbyId(Long id) {
		return em.find(Items.class, id);
	}
}
