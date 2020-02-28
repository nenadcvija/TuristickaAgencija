package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Destinacija;
import service.KorisnickiServis;

/**
 * Servlet implementation class BirajDestinacijuServlet
 */
@WebServlet("/BirajDestinacijuServlet")
public class BirajDestinacijuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		KorisnickiServis servis = new KorisnickiServis();
		
		List<Destinacija> destinacije = servis.dajSveDestinacije();
		
		if(destinacije != null) {
		
			request.setAttribute("destinacije", destinacije);
			RequestDispatcher dispatcher = request.getRequestDispatcher("view/birajDestinaciju.jsp");
			dispatcher.forward(request, response);
					
					
		}else {
			response.sendRedirect("view/userPage.jsp");
		}
		
		
	}

}
