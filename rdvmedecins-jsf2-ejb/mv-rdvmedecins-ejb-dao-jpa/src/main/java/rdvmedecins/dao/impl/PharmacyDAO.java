package rdvmedecins.dao.impl;

import javax.persistence.Query;
import rdvmedecins.dao.IPharmacyDAO;
import rdvmedecins.dao.AbstractDAO;
import rdvmedecins.jpa.Pharmacy;


public class PharmacyDAO extends AbstractDAO<Long, Pharmacy> implements IPharmacyDAO{

    @Override
    public Pharmacy findPharmacyById(long id) {
        Query query = createQuery("SELECT a FROM Pharmacy a where a.id =:id");
        query.setParameter("id", id);
        return (Pharmacy) query.getSingleResult();
    }
    
}
