package fr.umlv.jee.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "DailyRounds")
 
public class DailyRounds implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long id;    
     
    @Column(name="number")
    private int number;


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
