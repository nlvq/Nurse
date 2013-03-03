package rdvmedecins.dao;

import javax.ejb.EJB;
import javax.persistence.PersistenceContext;
import org.junit.Test;
import rdvmedecins.jpa.Pharmacy;

/**
 *
 * @author Pradier
 */
public class testPharmacyDAO {

    @EJB
    private IPharmacyDAO dao;

    private Pharmacy createPharmacy() {
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
