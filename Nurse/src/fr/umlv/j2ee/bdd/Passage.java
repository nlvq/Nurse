package bdd;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Passage")
 
public class Passage implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
    int ID = 1;
     
    @Column(name="StartTime")
    Date StartTime = new java.util.Date();
     
    @Column(name="EndTime")
    Date EndTime = new java.util.Date();

	public Passage(Date startTime, Date endTime) {
		super();
		StartTime = startTime;
		EndTime = endTime;
	}

	public Date getStartTime() {
		return StartTime;
	}

	public void setStartTime(Date startTime) {
		StartTime = startTime;
	}

	public Date getEndTime() {
		return EndTime;
	}

	public void setEndTime(Date endTime) {
		EndTime = endTime;
	}
}
