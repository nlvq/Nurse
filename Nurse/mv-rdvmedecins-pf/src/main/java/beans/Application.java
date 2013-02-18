/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import rdvmedecins.metier.service.IMetierLocal;

/**
 *
 * @author Serge Tahé
 */
@Named(value = "application")
@ApplicationScoped
public class Application {

  // couche métier
  @EJB
  private IMetierLocal metier;

  public Application() {
  }
  
  // getters

  public IMetierLocal getMetier() {
    return metier;
  }
  
}
