package fr.umlv.jee.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "HealthWorker")
public class HealthWorker implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "listName")
    private String listName;
    @Column(name = "lirthday")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthday;
    @Column(name = "address")
    private String address;
    @Column(name = "type")
    private String type;
    @Column(name = "securityNumber")
    private int securityNumber;
    @Column(name = "referencePersonName")
    private String referencePersonName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(int securityNumber) {
        this.securityNumber = securityNumber;
    }

    public String getReferencePersonName() {
        return referencePersonName;
    }

    public void setReferencePersonName(String referencePersonName) {
        this.referencePersonName = referencePersonName;
    }
}
