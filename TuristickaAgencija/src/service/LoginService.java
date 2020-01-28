package service;

import dao.LoginDAO;
import model.User;
import validacija.ValidacijaLogin;

public class LoginService {
	
	LoginDAO dao = new LoginDAO();
	
	ValidacijaLogin validacija = new ValidacijaLogin();

	
	public User vratiUseraLogIn(String userName, String password) {
		
		return dao.vratiUseraLogIn(userName,password);
	}

	public boolean daLiJeAdmin(User loginUser) {
		return validacija.daLiJeAdmin(loginUser);
	}
	
	
	

}
