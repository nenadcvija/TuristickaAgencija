package razno;

import model.Admin;
import model.Rola;
import model.TipTransporta;
import model.Transport;
import model.User;

public class Common {

	public User vratiUserModel(String userName, String password) {

		Admin admin = new Admin();

		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);

		if (userName.equals(admin.getAdminUserName()) && password.equals(admin.getAdminPassword())) {

			user.setRola(Rola.ADMIN);

		} else {
			user.setRola(Rola.KORISNIK);
		}

		return user;
	}

	public void podesiTipTransporta(Transport transport,String tipPrevoza) {
		
		  if(tipPrevoza.equals("avio")) {
		  transport.setTipTransporta(TipTransporta.AVION); 
		  }
		  else if(tipPrevoza.equals("autobus")) {
		  transport.setTipTransporta(TipTransporta.AUTOBUS); 
		  }
		  else if(tipPrevoza.equals("voz")) { 
		  transport.setTipTransporta(TipTransporta.VOZ);
		  }else{ 
		  transport.setTipTransporta(TipTransporta.SOPSTVENI); 
		} 
	}

	public Double izracunajCenuAranzmana(Double cenaSmestaja, Double popustSmestaj, Double cenaTransporta,
			Double popustZaTransport, String brojOsoba) {
		
		return (cenaSmestaja * (100-popustSmestaj)/100 + cenaTransporta * (100-popustZaTransport)/100)*Integer.parseInt(brojOsoba);
	}

}
