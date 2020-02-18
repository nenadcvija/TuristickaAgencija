package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Destinacija;
import model.Transport;

public class TransportDAO {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public List<Destinacija> vratiSveDestinacije() {
		
		List<Destinacija> destinacije = new ArrayList<Destinacija>();
		
		Session session = factory.getCurrentSession();
			session.beginTransaction();
		try {
			
			/*
			 * String sql = "FROM Destinacija";
			 * 
			 * Query query = session.createQuery(sql);
			 * 
			 * destinacije = query.getResultList();
			 */
			
			destinacije = session.createQuery("FROM Destinacija").getResultList();
			
			session.getTransaction().commit();
			return destinacije;
		} catch (Exception e) {
			session.getTransaction().rollback();
			return null;
		}
		

	}

	public Destinacija vratiDestinacijuPoID(String idDestinacija) {
		
		Destinacija destinacija = new Destinacija();
		Integer id = Integer.parseInt(idDestinacija);
		
	Session session = factory.getCurrentSession();
		session.beginTransaction();
	try {
		// metoda getSingleResult daje jedan rezultat obrade upita
		destinacija = 
				(Destinacija)session.createQuery("FROM Destinacija WHERE idDestinacija = :id").setParameter("id",id).getSingleResult();
		
		session.getTransaction().commit();
		return destinacija;
	} catch (Exception e) {
		session.getTransaction().rollback();
		return null;
	}
	}

	public boolean snimiTransport(Transport transport) {
		
	Session session = factory.getCurrentSession();
		session.beginTransaction();
		try {
			session.save(transport);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			return false;
		}
	}
	
	
	

}
