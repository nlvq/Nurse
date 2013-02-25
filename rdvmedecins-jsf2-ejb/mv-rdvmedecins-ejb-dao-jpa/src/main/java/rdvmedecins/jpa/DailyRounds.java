package rdvmedecins.jpa;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "DailyRounds")
 
public class DailyRounds implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    long id;    
     
    @Column(name="number")
    int number = 1;

	public DailyRounds(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
