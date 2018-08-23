package co.grandcircus.coffeeshop;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ItemsAdminDao {

	@PersistenceContext
	private EntityManager em;
	
}
