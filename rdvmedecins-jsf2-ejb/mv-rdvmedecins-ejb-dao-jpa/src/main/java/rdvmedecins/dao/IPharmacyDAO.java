package rdvmedecins.dao;

import javax.ejb.Local;
import rdvmedecins.jpa.Pharmacy;

/**
 *
 * @author Pradier
 */
@Local
public interface IPharmacyDAO extends IDAO<Long, Pharmacy> {
    
    public Pharmacy findPharmacyById(long id);
}
