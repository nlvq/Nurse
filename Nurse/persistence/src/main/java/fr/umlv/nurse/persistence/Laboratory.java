package fr.umlv.j2ee.bdd;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Laboratory")
 
public class Laboratory implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    long id;
     
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Laboratory(String name, int phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Column(name="name")
    String name = "";
     
    @Column(name="phoneNumber")
    int phoneNumber = 00000000;
}
