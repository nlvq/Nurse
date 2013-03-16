package fr.umlv.jee.sessions;

import javax.ejb.Remote;

@Remote
public interface PharmacyServiceRemote {

	public void createPharmacy(long id, String name, int phone);
}
