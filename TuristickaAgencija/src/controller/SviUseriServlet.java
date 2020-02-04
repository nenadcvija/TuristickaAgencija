package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import service.SviUseriServis;

/**
 * Servlet implementation class SviUseriServlet
 */
@WebServlet("/SviUseriServlet")
public class SviUseriServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SviUseriServis service = new SviUseriServis();
		
		List<User> useriIzBaze = new ArrayList<User>();
		
		useriIzBaze = service.vratiSveUsere();
		
		if(useriIzBaze != null) {
			HttpSession session = request.getSession();
			session.setAttribute("useriIzBaze", useriIzBaze);
			
			response.sendRedirect("view/sviUseri.jsp");
			
		}else {
			response.sendRedirect("view/adminPage.jsp");	
		}
		
		
	}

}
