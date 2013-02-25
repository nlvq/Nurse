package rdvmedecins.jpa;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "NursingManager")
 
public class NursingManager implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    long id;
     
	@Column(name="lastName")
	String lastName = "";

	@Column(name="fistName")
	String fistName = "";

	public NursingManager(String lastName, String fistName) {
		super();
		this.lastName = lastName;
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
}
