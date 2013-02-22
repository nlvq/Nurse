package fr.umlv.nurse.service;

import java.util.List;

import javax.ejb.Local;

import fr.umlv.nurse.persistence.Pharmacy;

@Local
public interface IPharmacyService {

	Pharmacy getPharmacyById(int id);
	
	List<Pharmacy> getAllPharmacys();
}
