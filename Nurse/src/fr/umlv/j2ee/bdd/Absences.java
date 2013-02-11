package fr.umlv.j2ee.bdd;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Absences")
 
public class Absences implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    long id;
     
    @Column(name="date")
    Date date = new java.util.Date();

	public Absences(Date date) {
		super();
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
