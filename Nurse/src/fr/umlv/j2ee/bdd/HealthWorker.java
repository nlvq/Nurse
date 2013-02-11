package bdd;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "HealthWorker")
 
public class HealthWorker implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
    int ID = 1;
    
	@Column(name="LastName")
	String LastName = "";

	@Column(name="FistName")
	String FistName = "";
     
    @Column(name="Birthday")
    Date Birthday = new java.util.Date();
     
    @Column(name="Address")
    String Address = "";
    
    @Column(name="Type")
    String Type = "";
    
    @Column(name="SecurityNumber")
    int SecurityNumber = 00000000;
     
    @Column(name="ReferencePersonName")
    String ReferencePersonName = "";
    
	public HealthWorker(String lastName, String fistName, Date birthday,
			String address, String type, int securityNumber,
			String referencePersonName) {
		super();
		LastName = lastName;
		FistName = fistName;
		Birthday = birthday;
		Address = address;
		Type = type;
		SecurityNumber = securityNumber;
		ReferencePersonName = referencePersonName;
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

	public Date getBirthday() {
		return Birthday;
	}

	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getSecurityNumber() {
		return SecurityNumber;
	}

	public void setSecurityNumber(int securityNumber) {
		SecurityNumber = securityNumber;
	}

	public String getReferencePersonName() {
		return ReferencePersonName;
	}

	public void setReferencePersonName(String referencePersonName) {
		ReferencePersonName = referencePersonName;
	}
}
