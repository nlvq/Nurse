package fr.umlv.j2ee.bdd;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Activity")
 
public class Evaluation implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    long id;
     
    @Column(name="name")
    String name = "";
    
    @Column(name="type")
    String type = "";

	public Evaluation(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

