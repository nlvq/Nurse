package fr.umlv.jee.ejb;

import javax.ejb.EJB;

import fr.umlv.jee.sessions.PharmacyService;

public class PharmacyClient {

	@EJB
	private static PharmacyService service;

	public static void main(String[] args) {
		service.createPharmacy();
	}
}
