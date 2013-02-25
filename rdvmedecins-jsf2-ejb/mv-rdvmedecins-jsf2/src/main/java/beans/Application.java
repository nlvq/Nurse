/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import rdvmedecins.jpa.Client;
import rdvmedecins.jpa.Medecin;
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
  // cache
  private List<Medecin> medecins;
  private List<Client> clients;
  private Map<Long, Medecin> hMedecins = new HashMap<Long, Medecin>();
  private Map<Long, Client> hClients = new HashMap<Long, Client>();
  // erreurs
  private List<Erreur> erreurs = new ArrayList<Erreur>();
  private Boolean erreur = false;

  public Application() {
  }

  @PostConstruct
  public void init() {
    // on met les médecins et les clients en cache
    try {
      medecins = metier.getAllMedecins();
      clients = metier.getAllClients();
    } catch (Throwable th) {
      // on note l'erreur
      erreur = true;
      erreurs.add(new Erreur(th.getClass().getName(), th.getMessage()));
      while (th.getCause() != null) {
        th = th.getCause();
        erreurs.add(new Erreur(th.getClass().getName(), th.getMessage()));
      }
      return;
    }
    // vérification des listes
    if (medecins.size() == 0) {
      // on note l'erreur
      erreur = true;
      erreurs.add(new Erreur("", "La liste des médecins est vide"));
    }
    if (clients.size() == 0) {
      // on note l'erreur
      erreur = true;
      erreurs.add(new Erreur("", "La liste des clients est vide"));
    }
    // erreur ?
    if (erreur) {
      return;
    }

    // les dictionnaires
    for (Medecin m : medecins) {
      hMedecins.put(m.getId(), m);
    }
    for (Client c : clients) {
      hClients.put(c.getId(), c);
    }
  }

  // getters et setters
  public List<Client> getClients() {
    return clients;
  }

  public List<Medecin> getMedecins() {
    return medecins;
  }

  public IMetierLocal getMetier() {
    return metier;
  }

  public Map<Long, Medecin> gethMedecins() {
    return hMedecins;
  }

  public Map<Long, Client> gethClients() {
    return hClients;
  }

  public Boolean getErreur() {
    return erreur;
  }

  public List<Erreur> getErreurs() {
    return erreurs;
  }
}
