package service;

import dao.DodajDestinacijuDAO;
import model.Destinacija;

public class DodajDestinacijuService {
	
	DodajDestinacijuDAO dao = new DodajDestinacijuDAO();
	
	public boolean dodajDestinaciju(Destinacija destinacija) {
		return dao.dodajDestinaciju(destinacija);
	}

}
