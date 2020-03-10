package service;

import java.util.List;

import dao.KorisnickiDAO;
import model.Destinacija;
import model.TipTransporta;
import model.Transport;

public class KorisnickiServis {
	
	KorisnickiDAO dao = new KorisnickiDAO();

	
	public List<Destinacija> dajSveDestinacije() {
		return dao.dajSveDestinacije();
	}


	public Destinacija vratiDestinacijuPoId(String idDestinacija) {
		return dao.vratiDestinacijuPoId(idDestinacija);
	}


	public Transport vratiTransport(Destinacija destinacija, TipTransporta tip) {
		return dao.vratiTransport(destinacija,tip);
	}
	
	

}
