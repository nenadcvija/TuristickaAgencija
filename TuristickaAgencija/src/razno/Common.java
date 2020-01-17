package razno;

import model.Admin;
import model.Rola;
import model.User;

public class Common {

	public User vratiUserModel(String userName, String password) {
		
		Admin admin = new Admin();
		
		User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
		
		if(userName.equals(admin.getAdminUserName()) && 
				password.equals(admin.getAdminPassword())) {
			
			user.setRola(Rola.ADMIN);
			
		}else {
			user.setRola(Rola.KORISNIK);
		}
		
		return user;
	}
	
	

}
