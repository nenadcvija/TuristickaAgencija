package service;

import java.util.List;

import dao.KorisnickiDAO;
import model.Destinacija;
import model.TipTransporta;
import model.Transport;
import razno.Common;

public class KorisnickiServis {
	
	KorisnickiDAO dao = new KorisnickiDAO();
	Common common = new Common();

	
	public List<Destinacija> dajSveDestinacije() {
		return dao.dajSveDestinacije();
	}


	public Destinacija vratiDestinacijuPoId(String idDestinacija) {
		return dao.vratiDestinacijuPoId(idDestinacija);
	}


	public List<Transport> vratiTransport() {
		return dao.vratiTransport();
	}


	public Double izracunajCenuAranzmana(Double cenaSmestaja, Double popustSmestaj, Double cenaTransporta,
			Double popustZaTransport, String brojOsoba) {
		return common.izracunajCenuAranzmana(cenaSmestaja, popustSmestaj, cenaTransporta,popustZaTransport,brojOsoba);
	}
	
	

}
