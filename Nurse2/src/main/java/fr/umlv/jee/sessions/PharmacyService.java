package fr.umlv.jee.sessions;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.umlv.jee.entity.Pharmacy;

@Stateless
@LocalBean
public class PharmacyService implements PharmacyServiceRemote,
		PharmacyServiceLocal {

	@PersistenceContext//(unitName = "Nurse")
	EntityManager em;

	public PharmacyService() {
		// TODO Auto-generated constructor stub
	}
	
	public void createPharmacy() {
		Pharmacy p = new Pharmacy();
		p.setId(1);
		p.setName("a");
		p.setPhoneNumber(21);
		
		em.persist(p);
	}

	@Override
	public void createPharmacy(long id, String name, int phone) {
		// TODO Auto-generated method stub
		
	}
	
	

}
