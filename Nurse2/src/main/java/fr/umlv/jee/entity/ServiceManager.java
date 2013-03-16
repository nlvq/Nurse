package fr.umlv.jee.entity;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "ServiceManager")
public class ServiceManager implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "fistName")
    private String fistName;

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
}
