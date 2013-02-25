package istia.st.client;

import java.util.Date;
import java.util.List;

import javax.naming.InitialContext;
import rdvmedecins.jpa.Client;
import rdvmedecins.jpa.Creneau;

import rdvmedecins.jpa.Medecin;
import rdvmedecins.jpa.Rv;
import rdvmedecins.metier.entites.AgendaMedecinJour;
import rdvmedecins.metier.service.IMetierRemote;

public class ClientRdvMedecinsMetier {

  // le nom de l'interface distante de l'EJB [Metier]
  private static String IDaoRemoteName = "java:global/istia.st_mv-rdvmedecins-metier-dao-ear_ear_1.0-SNAPSHOT/mv-rdvmedecins-ejb-metier-1.0-SNAPSHOT/Metier!rdvmedecins.metier.service.IMetierRemote";
  // date du jour
  private static Date jour = new Date();

  public static void main(String[] args) {
    try {
      // contexte JNDI du serveur Glassfish
      InitialContext initialContext = new InitialContext();
      // référence sur couche [metier] distante
      IMetierRemote metier = (IMetierRemote) initialContext.lookup(IDaoRemoteName);
      // affichage clients
      List<Client> clients = metier.getAllClients();
      display("Liste des clients :", clients);
      // affichage médecins
      List<Medecin> medecins = metier.getAllMedecins();
      display("Liste des médecins :", medecins);
      // affichage créneaux d'un médecin
      Medecin medecin = medecins.get(0);
      List<Creneau> creneaux = metier.getAllCreneaux(medecin);
      display(String.format("Liste des créneaux du médecin %s", medecin), creneaux);
      // liste des Rv d'un médecin, un jour donné
      display(String.format("Liste des rendez-vous du médecin %s, le [%s]", medecin, jour), metier.getRvMedecinJour(medecin, jour));
      // affichage agenda
      AgendaMedecinJour agenda = metier.getAgendaMedecinJour(medecin, jour);
      System.out.println(agenda);
      // ajouter un RV
      Rv rv = null;
      Creneau creneau = creneaux.get(2);
      Client client = clients.get(0);
      System.out.println(String.format("Ajout d'un Rv le [%s] dans le créneau %s pour le client %s", jour, creneau, client));
      rv = metier.ajouterRv(jour, creneau, client);
      System.out.println("Rv ajouté");
      display(String.format("Liste des Rv du médecin %s, le [%s]", medecin, jour), metier.getRvMedecinJour(medecin, jour));
      // affichage agenda
      agenda = metier.getAgendaMedecinJour(medecin, jour);
      System.out.println(agenda);
      // supprimer un RV
      System.out.println("Suppression du Rv ajouté");
      metier.supprimerRv(rv);
      System.out.println("Rv supprimé");
      display(String.format("Liste des Rv du médecin %s, le [%s]", medecin, jour), metier.getRvMedecinJour(medecin, jour));
      // affichage agenda
      agenda = metier.getAgendaMedecinJour(medecin, jour);
      System.out.println(agenda);
    } catch (Throwable ex) {
      System.out.println("Erreur...");
      while (ex != null) {
        System.out.println(String.format("%s : %s", ex.getClass().getName(), ex.getMessage()));
        ex = ex.getCause();
      }
    }
  }

  // méthode utilitaire - affiche les éléments d'une collection
  private static void display(String message, List elements) {
    System.out.println(message);
    for (Object element : elements) {
      System.out.println(element);
    }
  }
}
