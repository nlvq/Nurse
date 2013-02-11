package bdd;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "TypeOfLeave")
 
public class TypeOfLeave implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
    int ID = 1;
     
    @Column(name="Name")
    String Name = "";

	public TypeOfLeave(String name) {
		super();
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
