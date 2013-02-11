package bdd;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "ServiceManager")
 
public class ServiceManager implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
    int ID = 1;
     
	@Column(name="LastName")
	String LastName = "";

	@Column(name="FistName")
	String FistName = "";

	public ServiceManager(String lastName, String fistName) {
		super();
		LastName = lastName;
		FistName = fistName;
	}

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

	
}
