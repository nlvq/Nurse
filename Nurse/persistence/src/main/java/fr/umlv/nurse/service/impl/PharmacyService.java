package fr.umlv.nurse.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;

import fr.umlv.nurse.dao.IPharmacyDAO;
import fr.umlv.nurse.persistence.Pharmacy;
import fr.umlv.nurse.service.IPharmacyService;

@Stateless
public class PharmacyService implements IPharmacyService{

	// Injecte un contexte de persistence dans le service
	@PersistenceContext
	private IPharmacyDAO dao;
	
	@Override
	public Pharmacy getPharmacyById(int id) {
		return dao.getPharmacyById(id);
	}

	@Override
	public List<Pharmacy> getAllPharmacys() {
		return dao.getAllPharmacys();
	}

}
