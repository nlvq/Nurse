package fr.umlv.nurse.dao;

import static org.junit.Assert.assertEquals;

import javax.persistence.PersistenceContext;

import org.junit.Test;

import fr.umlv.nurse.persistence.Pharmacy;

public class TestPharmacyDAO {

	@PersistenceContext
	private IPharmacyDAO dao;
	
	private Pharmacy createPharmacy() {
		Pharmacy p = new Pharmacy();
		p.setId(1);
		p.setName("test");
		p.setPhone(200);
		dao.persist(p);
		return p;
	}
	
	@Test
	public void testFindPharmacyById() {
		Pharmacy p = createPharmacy();
		assertEquals(p, dao.getPharmacyById(1));
	}
}
