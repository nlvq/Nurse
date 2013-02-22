package fr.umlv.nurse.dao.impl;

import java.util.List;

import javax.persistence.Query;

import fr.umlv.nurse.dao.AbstractDAO;
import fr.umlv.nurse.dao.IPharmacyDAO;
import fr.umlv.nurse.persistence.Pharmacy;

public class PharmacyDAO extends AbstractDAO<Integer, Pharmacy> implements IPharmacyDAO{
	
	@Override
	public Pharmacy getPharmacyById(int id) {
		Query query = createQuery("SELECT a FROM Pharmacy a where a.id =:id");
		query.setParameter("id", id);
		return (Pharmacy) query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pharmacy> getAllPharmacys() {
		Query query = createQuery("SELECT a FROM Pharmacy a");
		return (List<Pharmacy>) query.getResultList();
	}
}
