package fr.umlv.nurse.dao;

import java.util.List;

import fr.umlv.nurse.persistence.Pharmacy;

public interface IPharmacyDAO extends IDAO<Integer, Pharmacy> {

	Pharmacy getPharmacyById(int id);

	List<Pharmacy> getAllPharmacys();
}
