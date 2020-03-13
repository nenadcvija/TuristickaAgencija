package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Destinacija;
import model.Racun;
import model.TipTransporta;
import model.Transport;
import model.User;
import service.KorisnickiServis;

/**
 * Servlet implementation class PraviRacunServlet
 */
@WebServlet(description = "ovde pravimo racun", urlPatterns = { "/PraviRacunServlet" })
public class PraviRacunServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//preuzimam usera iz sesije
		HttpSession sesija = request.getSession();
		User user = (User)sesija.getAttribute("user");
				
		//preuzimam iz URL-a	
		String idDestinacija = request.getParameter("idDestinacija");
		String tipPrevoza = request.getParameter("tipPrevoza");
		// ovde imam broj osoba
		String brojOsoba = request.getParameter("brojOsoba");
		
		KorisnickiServis servis = new KorisnickiServis();
		Destinacija destinacija = servis.vratiDestinacijuPoId(idDestinacija);
		
		//ovde imam sve za smestaj sto mi treba
		Double cenaSmestaja = destinacija.getCenaSmestaja();
		Double popustSmestaj = destinacija.getPopust();
		
		Transport transport = new Transport();
		List<Transport> sviTransporti = servis.vratiTransport();
		
		TipTransporta tip;
		
		if(!tipPrevoza.equals("0")) {
			if(tipPrevoza.equals("1")) {
				tip = TipTransporta.AUTOBUS;
			}else if(tipPrevoza.equals("2")) {
				tip = TipTransporta.VOZ;
			}else {
				tip = TipTransporta.AVION;
			}
		
		Double cenaTransporta;
		Double popustZaTransport;
		
		if(!tip.equals(TipTransporta.SOPSTVENI)) {
			//nasao sam transport
			for(Transport t: sviTransporti)	{
				if(t.getDestinacija().getIdDestinacija() == destinacija.getIdDestinacija() &&t.getTipTransporta().equals(tip)) 
				{ 
					transport = t; 
				}		 
			}
			// ovde imam sve sto mi treba za transport
			cenaTransporta = transport.getCena();
			popustZaTransport = transport.getPopust();
		}else {
			cenaTransporta = 0.0;
			popustZaTransport = 0.0;
		}

		Double cenaAranzmana = servis.izracunajCenuAranzmana(cenaSmestaja,popustSmestaj,cenaTransporta,popustZaTransport,brojOsoba);
		
		if(user.getBalance()>=cenaAranzmana) {
			//sve ok
			Racun racun = new Racun();
			racun.setCenaSmestaja(cenaSmestaja * (100-popustSmestaj)/100 * Integer.parseInt(brojOsoba));
			racun.setCenaTransporta(cenaTransporta * (100-popustZaTransport)/100 * Integer.parseInt(brojOsoba) );
			racun.setTotal(cenaAranzmana);
			racun.setUser(user);
			
			request.setAttribute("racun", racun);
			RequestDispatcher dispatcher = request.getRequestDispatcher("view/racun.jsp");
			dispatcher.forward(request, response);
			
		}else {
			//ponovo
			response.sendRedirect("view/userPage.jsp");
		}
		
	
			
			
			
	
		
		
		
		
		}
		
		
	}

}
