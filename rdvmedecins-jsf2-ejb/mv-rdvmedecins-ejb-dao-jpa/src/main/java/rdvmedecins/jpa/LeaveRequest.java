package rdvmedecins.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "LeaveRequest")
 
public class LeaveRequest implements Serializable{
    private static final long serialVersionUID = 1L;
     
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	int ID = 1;

	@Column(name="StartTime")
	Date StartTime = new java.util.Date();

	@Column(name="EndTime")
	Date EndTime = new java.util.Date();

	@Column(name="Description")
	String Description = "";

	public LeaveRequest(Date startTime, Date endTime, String description) {
		super();
		StartTime = startTime;
		EndTime = endTime;
		Description = description;
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

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}	
}
