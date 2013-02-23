package fr.umlv.j2ee.bdd;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Activity")
 
public class Activity implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    long id;
     
    @Column(name="description")
    String description = "";

	public Activity(int iD, String description) {
		super();
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
}
