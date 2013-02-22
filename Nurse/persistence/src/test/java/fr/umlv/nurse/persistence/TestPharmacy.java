package fr.umlv.nurse.persistence;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPharmacy {

	@Test
	public void testCreatePharmacy() {
		Pharmacy p = new Pharmacy();
		p.setId(1);
		p.setName("test");
		p.setPhone(200);
		assertEquals(1, p.getId());
		assertEquals("test", p.getName());
		assertEquals(200, p.getPhone());
	}
}
