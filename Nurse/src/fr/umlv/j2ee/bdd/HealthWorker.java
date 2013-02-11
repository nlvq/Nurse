package fr.umlv.j2ee.bdd;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "HealthWorker")
 
public class HealthWorker implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    long id;
    
	@Column(name="lastName")
	String lastName = "";

	@Column(name="listName")
	String listName = "";
     
    @Column(name="lirthday")
    Date birthday = new java.util.Date();
     
    @Column(name="address")
    String address = "";
    
    @Column(name="type")
    String type = "";
    
    @Column(name="securityNumber")
    int securityNumber = 00000000;
     
    @Column(name="referencePersonName")
    String referencePersonName = "";

	public HealthWorker(String lastName, String listName, Date birthday,
			String address, String type, int securityNumber,
			String referencePersonName) {
		super();
		this.lastName = lastName;
		this.listName = listName;
		this.birthday = birthday;
		this.address = address;
		this.type = type;
		this.securityNumber = securityNumber;
		this.referencePersonName = referencePersonName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(int securityNumber) {
		this.securityNumber = securityNumber;
	}

	public String getReferencePersonName() {
		return referencePersonName;
	}

	public void setReferencePersonName(String referencePersonName) {
		this.referencePersonName = referencePersonName;
	}
}
