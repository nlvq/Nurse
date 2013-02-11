package bdd;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Patient")
 
public class Patient implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="SecurityNumber")
    int SecurityNumber = 1;
     
    @Column(name="LastName")
    String LastName = "";
     
    @Column(name="FistName")
    String FistName = "";
     
    @Column(name="Birthday")
    Date Birthday = new java.util.Date();
     
    @Column(name="Address")
    String Address = "";
     
    @Column(name="PhoneNumber")
    int PhoneNumber = 00000000;
     
    @Column(name="ReferencePersonName")
    String ReferencePersonName = "";
     
    @Column(name="ReferencePersonPhoneNumber")
    int ReferencePersonPhoneNumber = 00000000;
     
    @Column(name="Key")
    int Key = 1;
     
    @Column(name="Priority")
    int Priority = 1;
     
    @Column(name="PassingDay")
    Date PassingDay = new java.util.Date();
    
    @Column(name="TypeOfNursingStaffToPass")
    String TypeOfNursingStaffToPass = "";
     
    @Column(name="NumberOfNursin")
    int NumberOfNursin = 1;
    
    @ManyToOne
    private Laboratory laboratory;
    
    @ManyToOne
    private Doctor doctor;


	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient(int securityNumber, String lastName, String fistName,
			Date birthday, String address, int phoneNumber,
			String referencePersonName, int referencePersonPhoneNumber,
			int key, int priority, Date passingDay,
			String typeOfNursingStaffToPass, int numberOfNursin) {
		super();
		SecurityNumber = securityNumber;
		LastName = lastName;
		FistName = fistName;
		Birthday = birthday;
		Address = address;
		PhoneNumber = phoneNumber;
		ReferencePersonName = referencePersonName;
		ReferencePersonPhoneNumber = referencePersonPhoneNumber;
		Key = key;
		Priority = priority;
		PassingDay = passingDay;
		TypeOfNursingStaffToPass = typeOfNursingStaffToPass;
		NumberOfNursin = numberOfNursin;
	}

	public int getSecurityNumber() {
		return SecurityNumber;
	}

	public void setSecurityNumber(int securityNumber) {
		SecurityNumber = securityNumber;
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

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getReferencePersonName() {
		return ReferencePersonName;
	}

	public void setReferencePersonName(String referencePersonName) {
		ReferencePersonName = referencePersonName;
	}

	public int getReferencePersonPhoneNumber() {
		return ReferencePersonPhoneNumber;
	}

	public void setReferencePersonPhoneNumber(int referencePersonPhoneNumber) {
		ReferencePersonPhoneNumber = referencePersonPhoneNumber;
	}

	public int getKey() {
		return Key;
	}

	public void setKey(int key) {
		Key = key;
	}

	public int getPriority() {
		return Priority;
	}

	public void setPriority(int priority) {
		Priority = priority;
	}

	public Date getPassingDay() {
		return PassingDay;
	}

	public void setPassingDay(Date passingDay) {
		PassingDay = passingDay;
	}

	public String getTypeOfNursingStaffToPass() {
		return TypeOfNursingStaffToPass;
	}

	public void setTypeOfNursingStaffToPass(String typeOfNursingStaffToPass) {
		TypeOfNursingStaffToPass = typeOfNursingStaffToPass;
	}

	public int getNumberOfNursin() {
		return NumberOfNursin;
	}

	public void setNumberOfNursin(int numberOfNursin) {
		NumberOfNursin = numberOfNursin;
	}

	public Laboratory getLaboratory() {
		return laboratory;
	}

	public void setLaboratory(Laboratory laboratory) {
		this.laboratory = laboratory;
	}
	
}
