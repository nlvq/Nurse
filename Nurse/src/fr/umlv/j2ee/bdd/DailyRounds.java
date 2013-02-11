package bdd;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "DailyRounds")
 
public class DailyRounds implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
    int ID = 1;    
     
    @Column(name="Number")
    int Number = 1;

	public DailyRounds(int number) {
		super();
		Number = number;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}	
}
