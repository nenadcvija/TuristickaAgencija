package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.SviUseriServis;

/**
 * Servlet implementation class DodajBalanceServlet
 */
@WebServlet("/DodajBalanceServlet")
public class DodajBalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String add = request.getParameter("add");
		
		System.out.println("ID:" + id);
		System.out.println("ADD:" + add);
		
		  Integer idUser = Integer.parseInt(id); 
		  Double addBalance = Double.parseDouble(add);
		 
		  SviUseriServis servis = new SviUseriServis(); 
		 
		/*
		 * User user = new User(); List<User> useri = servis.vratiSveUsere(); for(User
		 * u: useri) { if(u.getIdUser() == idUser) { user = u; } }
		 */
		
		  boolean daLisiDodaoBalance =servis.dodajBalance(idUser,addBalance);
		  
		  if(daLisiDodaoBalance) 
		  { response.sendRedirect("view/adminPage.jsp"); }
		  else {
		  response.sendRedirect("view/dodajBalance.jsp"); }
		 
		
		
		
		
		
		
		
		
		
	}

}
