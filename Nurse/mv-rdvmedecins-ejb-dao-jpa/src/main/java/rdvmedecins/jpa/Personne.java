package rdvmedecins.jpa;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@MappedSuperclass
public class Personne implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Long id;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 5)
  @Column(name = "TITRE")
  private String titre;

  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 30)
  @Column(name = "NOM")
  private String nom;

  @Basic(optional = false)
  @NotNull
  @Column(name = "VERSION")
  @Version
  private int version;
  
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 30)
  @Column(name = "PRENOM")
  private String prenom;

  public Personne() {
  }

  public Personne(Long id) {
    this.id = id;
  }

  public Personne(Long id, String titre, String nom, int version, String prenom) {
    this.id = id;
    this.titre = titre;
    this.nom = nom;
    this.version = version;
    this.prenom = prenom;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitre() {
    return titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getVersion() {
    return version;
  }

  public void setVersion(int version) {
    this.version = version;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  @Override
  public String toString() {
    return String.format("[%s,%s,%s,%s,%s]", id, version, titre, prenom, nom);
  }
  
}
