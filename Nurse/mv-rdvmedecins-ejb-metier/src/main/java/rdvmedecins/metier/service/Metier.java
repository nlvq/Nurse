package rdvmedecins.metier.service;

import java.io.Serializable;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import rdvmedecins.dao.IDaoLocal;
import rdvmedecins.jpa.Client;
import rdvmedecins.jpa.Creneau;
import rdvmedecins.jpa.Medecin;
import rdvmedecins.jpa.Rv;
import rdvmedecins.metier.entites.AgendaMedecinJour;
import rdvmedecins.metier.entites.CreneauMedecinJour;

@Singleton
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class Metier implements IMetierLocal, IMetierRemote, Serializable {

  // couche dao
  @EJB
  private IDaoLocal dao;

  public Metier() {
  }

  @Override
  public List<Client> getAllClients() {
    return dao.getAllClients();
  }

  @Override
  public List<Medecin> getAllMedecins() {
    return dao.getAllMedecins();
  }

  @Override
  public List<Creneau> getAllCreneaux(Medecin medecin) {
    return dao.getAllCreneaux(medecin);
  }

  @Override
  public List<Rv> getRvMedecinJour(Medecin medecin, Date jour) {
    return dao.getRvMedecinJour(medecin, jour);
  }

  @Override
  public Client getClientById(Long id) {
    return dao.getClientById(id);
  }

  @Override
  public Medecin getMedecinById(Long id) {
    return dao.getMedecinById(id);
  }

  @Override
  public Rv getRvById(Long id) {
    return dao.getRvById(id);
  }

  @Override
  public Creneau getCreneauById(Long id) {
    return dao.getCreneauById(id);
  }

  @Override
  public Rv ajouterRv(Date jour, Creneau creneau, Client client) {
    return dao.ajouterRv(jour, creneau, client);
  }

  @Override
  public void supprimerRv(Rv rv) {
    dao.supprimerRv(rv);
  }

  @Override
  public AgendaMedecinJour getAgendaMedecinJour(Medecin medecin, Date jour) {
    // liste des créneaux horaires du médecin
    List<Creneau> creneauxHoraires = dao.getAllCreneaux(medecin);
    // liste des réservations de ce même médecin pour ce même jour
    List<Rv> reservations = dao.getRvMedecinJour(medecin, jour);
    // on crée un dictionnaire à partir des Rv pris
    Map<Long, Rv> hReservations = new Hashtable<Long, Rv>();
    for (Rv resa : reservations) {
      hReservations.put(resa.getCreneau().getId(), resa);
    }
    // on crée l'agenda pour le jour demandé
    AgendaMedecinJour agenda = new AgendaMedecinJour();
    // le médecin
    agenda.setMedecin(medecin);
    // le jour
    agenda.setJour(jour);
    // les créneaux de réservation
    CreneauMedecinJour[] creneauxMedecinJour = new CreneauMedecinJour[creneauxHoraires.size()];
    agenda.setCreneauxMedecinJour(creneauxMedecinJour);
    // remplissage des créneaux de réservation
    for (int i = 0; i < creneauxHoraires.size(); i++) {
      // ligne i agenda
      creneauxMedecinJour[i] = new CreneauMedecinJour();
      // id du créneau
      creneauxMedecinJour[i].setCreneau(creneauxHoraires.get(i));
      // le créneau est-il libre ou réservé ?
      if (hReservations.containsKey(creneauxHoraires.get(i).getId())) {
        // le créneau est occupé - on note la resa
        Rv resa = hReservations.get(creneauxHoraires.get(i).getId());
        creneauxMedecinJour[i].setRv(resa);
      }
    }
    // on rend le résultat
    return agenda;
  }
}
