package rdvmedecins.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Patient")
 
public class Patient implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="securityNumber")
    int securityNumber = 1;
     
    @Column(name="lLastName")
    String lastName = "";
     
    @Column(name="fistName")
    String fistName = "";
     
    @Column(name="birthday")
    Date birthday = new java.util.Date();
     
    @Column(name="address")
    String address = "";
     
    @Column(name="phoneNumber")
    int phoneNumber = 00000000;
     
    @Column(name="referencePersonName")
    String referencePersonName = "";
     
    @Column(name="referencePersonPhoneNumber")
    int referencePersonPhoneNumber = 00000000;
     
    @Column(name="key")
    int key = 1;
     
    @Column(name="priority")
    int priority = 1;
     
    @Column(name="passingDay")
    Date passingDay = new java.util.Date();
    
    @Column(name="typeOfNursingStaffToPass")
    String typeOfNursingStaffToPass = "";
     
    @Column(name="numberOfNursin")
    int numberOfNursin = 1;
    
    @ManyToOne
    private Laboratory laboratory;
    
    @ManyToOne
    private Doctor doctor;
    
    @ManyToOne
    private Pharmacy pharmacy;

	public Patient(int securityNumber, String lastName, String fistName,
			Date birthday, String address, int phoneNumber,
			String referencePersonName, int referencePersonPhoneNumber,
			int key, int priority, Date passingDay,
			String typeOfNursingStaffToPass, int numberOfNursin,
			Laboratory laboratory, Doctor doctor, Pharmacy pharmacy) {
		super();
		this.securityNumber = securityNumber;
		this.lastName = lastName;
		this.fistName = fistName;
		this.birthday = birthday;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.referencePersonName = referencePersonName;
		this.referencePersonPhoneNumber = referencePersonPhoneNumber;
		this.key = key;
		this.priority = priority;
		this.passingDay = passingDay;
		this.typeOfNursingStaffToPass = typeOfNursingStaffToPass;
		this.numberOfNursin = numberOfNursin;
		this.laboratory = laboratory;
		this.doctor = doctor;
		this.pharmacy = pharmacy;
	}

	public int getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(int securityNumber) {
		this.securityNumber = securityNumber;
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

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getReferencePersonName() {
		return referencePersonName;
	}

	public void setReferencePersonName(String referencePersonName) {
		this.referencePersonName = referencePersonName;
	}

	public int getReferencePersonPhoneNumber() {
		return referencePersonPhoneNumber;
	}

	public void setReferencePersonPhoneNumber(int referencePersonPhoneNumber) {
		this.referencePersonPhoneNumber = referencePersonPhoneNumber;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getPassingDay() {
		return passingDay;
	}

	public void setPassingDay(Date passingDay) {
		this.passingDay = passingDay;
	}

	public String getTypeOfNursingStaffToPass() {
		return typeOfNursingStaffToPass;
	}

	public void setTypeOfNursingStaffToPass(String typeOfNursingStaffToPass) {
		this.typeOfNursingStaffToPass = typeOfNursingStaffToPass;
	}

	public int getNumberOfNursin() {
		return numberOfNursin;
	}

	public void setNumberOfNursin(int numberOfNursin) {
		this.numberOfNursin = numberOfNursin;
	}

	public Laboratory getLaboratory() {
		return laboratory;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public Pharmacy getPharmacy() {
		return pharmacy;
	}
}
