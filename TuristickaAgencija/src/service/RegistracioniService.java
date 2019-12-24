package service;

import dao.RegistracijaDAO;
import validacija.ValidacijaRegistracije;

public class RegistracioniService {
	
	// povezujem se sa validacijom
	ValidacijaRegistracije validacija = new ValidacijaRegistracije();
	
	// povezujem se sa dao klasom
	RegistracijaDAO dao = new RegistracijaDAO();
	
	public boolean daLiSuIstiPasswordi(String password, String repeatedPassword) {
		return validacija.daLiSuIstiPasswordi(password, repeatedPassword);
	}
	

}
