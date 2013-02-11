package bdd;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Doctor")

public class Doctor implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	int ID = 1;

	@Column(name="LastName")
	String LastName = "";

	@Column(name="FistName")
	String FistName = "";

	@Column(name="PhoneNumber")
	int PhoneNumber = 00000000;

	@Column(name="MedicalSpecialty")
	String MedicalSpecialty = "";

	public Doctor(int iD, String lastName, String fistName, int phoneNumber,
			String medicalSpecialty) {
		super();
		LastName = lastName;
		FistName = fistName;
		PhoneNumber = phoneNumber;
		MedicalSpecialty = medicalSpecialty;
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

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getMedicalSpecialty() {
		return MedicalSpecialty;
	}

	public void setMedicalSpecialty(String medicalSpecialty) {
		MedicalSpecialty = medicalSpecialty;
	}

}
