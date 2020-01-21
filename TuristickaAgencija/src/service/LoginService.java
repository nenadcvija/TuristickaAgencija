package service;

import javax.transaction.Transactional;

import dao.LoginDAO;
import model.User;

public class LoginService {
	
	LoginDAO dao = new LoginDAO();

	@Transactional
	public User vratiUseraLogIn(String userName, String password) {
		
		return dao.vratiUseraLogIn(userName,password);
	}
	
	
	

}
