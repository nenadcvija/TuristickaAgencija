package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Destinacija;
import model.TipTransporta;
import model.Transport;
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
		
		String idDestinacija = request.getParameter("idDestinacija");
		String tipPrevoza = request.getParameter("tipPrevoza");
		String brojOsoba = request.getParameter("brojOsoba");
		
		KorisnickiServis servis = new KorisnickiServis();
		Destinacija destinacija = servis.vratiDestinacijuPoId(idDestinacija);
		
		Double cenaSmestaja = destinacija.getCenaSmestaja();
		Double popustSmestaj = destinacija.getPopust();
		
		Transport transport = new Transport();
		TipTransporta tip;
		
		if(!tipPrevoza.equals("0")) {
			if(tipPrevoza.equals("1")) {
				tip = TipTransporta.AUTOBUS;
			}else if(tipPrevoza.equals("2")) {
				tip = TipTransporta.VOZ;
			}else {
				tip = TipTransporta.AVION;
			}
			transport = servis.vratiTransport(destinacija,tip);
			Double cenaTransporta = transport.getCena();
			Double popustTransport = transport.getPopust();
			
			System.out.println(cenaTransporta + " " + popustTransport);
			
		}
		
		
	}

}
