package bdd;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Absences")
 
public class Absences implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
    int ID = 1;
     
    @Column(name="Name")
    String Name = "";
     
    @Column(name="PhoneNumber")
    int PhoneNumber = 00000000;

	public Absences(String name, int phoneNumber) {
		super();
		Name = name;
		PhoneNumber = phoneNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}	
}
