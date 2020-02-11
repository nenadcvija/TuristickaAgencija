package dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Destinacija;

public class DodajDestinacijuDAO {

	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	 public boolean dodajDestinaciju(Destinacija destinacija) {
	 
	 Session session = factory.openSession(); session.beginTransaction();
	 
	 try { session.save(destinacija); 
	 session.getTransaction().commit(); 
	 return true; } 
	 catch (Exception e) { 
		 session.getTransaction().rollback(); 
		 return false; } 
	 finally { session.close(); }
	 
	  }
	 

}
