package fr.umlv.jee.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "LeaveRequest")
public class LeaveRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name = "startTime")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startTime;
    @Column(name = "endTime")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endTime;
    @Column(name = "description")
    private String description;

    public Date getstartTime() {
        return startTime;
    }

    public void setstartTime(Date startTime) {
        startTime = startTime;
    }

    public Date getendTime() {
        return endTime;
    }

    public void setendTime(Date endTime) {
        endTime = endTime;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        description = description;
    }
}
