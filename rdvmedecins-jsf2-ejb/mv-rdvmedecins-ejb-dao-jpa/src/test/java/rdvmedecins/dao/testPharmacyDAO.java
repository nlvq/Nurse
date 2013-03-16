package rdvmedecins.dao;

import javax.ejb.EJB;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import org.junit.Test;
import rdvmedecins.jpa.Pharmacy;

/**
 *
 * @author Pradier
 */
public class testPharmacyDAO {

    @PersistenceContext
    private IPharmacyDAO dao;
    
    
    private void init() {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
    	dao.setEntityManager(emf.createEntityManager());
    }

    private Pharmacy createPharmacy() {
    	init();
        Pharmacy p = new Pharmacy();
        p.setId(1);
        p.setName("test");
        p.setPhoneNumber(200);
        dao.persist(p);
        return p;
    }

    @Test
    public void testFindPharmacyById() {
        Pharmacy p = createPharmacy();
        //assertEquals(p, dao.getPharmacyById(1));
    }
}

