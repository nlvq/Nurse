package fr.umlv.nurse.jsf;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.umlv.nurse.service.impl.PharmacyService;

@ManagedBean(name = "PharmacyBean")
@SessionScoped
public class PharmacyBean implements Serializable {

	private static final long serialVersionUID = -2681024257427238988L;

	@EJB
	private PharmacyService service;
	
	public PharmacyService getService() {
		return service;
	}
	
}
