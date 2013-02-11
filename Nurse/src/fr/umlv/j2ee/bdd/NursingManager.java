package bdd;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "NursingManager")
 
public class NursingManager implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
    int ID = 1;
     
	@Column(name="LastName")
	String LastName = "";

	@Column(name="FistName")
	String FistName = "";

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFistName() {
		return FistName;
	}

	public void setFistName(String fistName) {
		FistName = fistName;
	}

	public NursingManager(String lastName, String fistName) {
		super();
		LastName = lastName;
		FistName = fistName;
	}
	
}
