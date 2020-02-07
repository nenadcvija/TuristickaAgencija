package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Destinacija;
import service.DodajDestinacijuService;

/**
 * Servlet implementation class DodajDestinacijuServlet
 */
@WebServlet("/DodajDestinacijuServlet")
public class DodajDestinacijuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Dosao si na dodaj destinaciju servlet");
		
		//prihvatili smo parametre
		String drzava = request.getParameter("drzava");
		String mesto = request.getParameter("mesto");
		String smestaj = request.getParameter("smestaj");
		String cena = request.getParameter("cena");
		String popust = request.getParameter("popust");
		
		//pravimo model
		Destinacija destinacija = new Destinacija();
		destinacija.setDrzava(drzava);
		destinacija.setMesto(mesto);
		destinacija.setSmestaj(smestaj);
		destinacija.setCenaSmestaja(Double.parseDouble(cena));
		destinacija.setPopust(Double.parseDouble(popust));
		
		DodajDestinacijuService service = new DodajDestinacijuService();
		
		boolean daLiJeUpisaoUBazu = service.dodajDestinaciju(destinacija);
		
		if(daLiJeUpisaoUBazu) {
			response.sendRedirect("view/adminPage.jsp");
		}else {
			response.sendRedirect("index.html");
		}
		
		
	}

}
