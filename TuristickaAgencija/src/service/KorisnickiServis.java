package service;

import java.util.List;

import dao.KorisnickiDAO;
import model.Destinacija;

public class KorisnickiServis {
	
	KorisnickiDAO dao = new KorisnickiDAO();

	
	
	public List<Destinacija> dajSveDestinacije() {
		return dao.dajSveDestinacije();
	}
	
	

}
