package rdvmedecins.jpa;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Alert")
 
public class Alert implements Serializable{
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    long id;
     
    @Column(name="description")
    String description = "";

	public Alert(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
