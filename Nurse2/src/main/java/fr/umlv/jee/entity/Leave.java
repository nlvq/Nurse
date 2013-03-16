package fr.umlv.jee.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Leave")
public class Leave implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "startTime")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startTime;
    @Column(name = "endTime")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
