package fr.umlv.jee.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.junit.Test;

import fr.umlv.jee.entity.Pharmacy;

public class testPharmacyPersistence {

	@PersistenceContext
	private EntityManager em;

	private void init() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Test");
		em = emf.createEntityManager();
	}

	private Pharmacy createPharmacy() {
		init();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Pharmacy p = new Pharmacy();
		p.setId(1);
		p.setName("test");
		p.setPhoneNumber(200);
		em.persist(p);
		t.commit();
		em.close();
		return p;
	}

	@Test
	public void testFindPharmacyById() {
		Pharmacy p = createPharmacy();
		// assertEquals(p, dao.getPharmacyById(1));
	}
}
