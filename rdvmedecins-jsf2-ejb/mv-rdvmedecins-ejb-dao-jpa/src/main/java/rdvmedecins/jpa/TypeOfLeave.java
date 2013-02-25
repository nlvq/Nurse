package rdvmedecins.jpa;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "TypeOfLeave")
 
public class TypeOfLeave implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    long id;
     
    @Column(name="name")
    String name = "";

	public TypeOfLeave(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
