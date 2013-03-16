package fr.umlv.jee.entity;


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
    private int securityNumber;
     
    @Column(name="lLastName")
    private String lastName;
     
    @Column(name="fistName")
    private String fistName;
     
    @Column(name="birthday")
    @Temporal(javax.persistence.TemporalType.DATE)
    Date birthday;
     
    @Column(name="address")
    private String address;
     
    @Column(name="phoneNumber")
    private int phoneNumber;
     
    @Column(name="referencePersonName")
    private String referencePersonName;
     
    @Column(name="referencePersonPhoneNumber")
    private int referencePersonPhoneNumber;
     
    @Column(name="key")
    private int key;
     
    @Column(name="priority")
    private int priority;
     
    @Column(name="passingDay")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date passingDay;
    
    @Column(name="typeOfNursingStaffToPass")
    private String typeOfNursingStaffToPass;
     
    @Column(name="numberOfNursin")
    private int numberOfNursin = 1;
    
    @ManyToOne
    private Laboratory laboratory;
    
    @ManyToOne
    private Doctor doctor;
    
    @ManyToOne
    private Pharmacy pharmacy;

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
