package rdvmedecins.jpa;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Doctor")

public class Doctor implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	long id;

	@Column(name="lastName")
	String lastName = "";

	@Column(name="fistName")
	String fistName = "";

	@Column(name="phoneNumber")
	int phoneNumber = 00000000;

	@Column(name="medicalSpecialty")
	String medicalSpecialty = "";

	public Doctor(String lastName, String fistName, int phoneNumber,
			String medicalSpecialty) {
		super();
		this.lastName = lastName;
		this.fistName = fistName;
		this.phoneNumber = phoneNumber;
		this.medicalSpecialty = medicalSpecialty;
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

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMedicalSpecialty() {
		return medicalSpecialty;
	}

	public void setMedicalSpecialty(String medicalSpecialty) {
		this.medicalSpecialty = medicalSpecialty;
	}
}
