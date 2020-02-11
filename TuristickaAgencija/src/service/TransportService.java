package service;

import java.util.List;

import dao.TransportDAO;
import model.Destinacija;

public class TransportService {
	
	TransportDAO dao = new TransportDAO();

	public List<Destinacija> vratiSveDestinacije() {

		return dao.vratiSveDestinacije();
	}

}
