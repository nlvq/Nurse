package fr.umlv.jee.sessions;

import javax.ejb.Local;

@Local
public interface PharmacyServiceLocal {
	
	public void createPharmacy(long id, String name, int phone) ;

}
