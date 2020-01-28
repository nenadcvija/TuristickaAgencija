package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.User;

public class LoginDAO {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	
	public User vratiUseraLogIn(String userName, String password) {
	
		Session sesija = factory.openSession();
		sesija.beginTransaction();
	
			try {
				Query query = sesija.createQuery("FROM User WHERE userName = :x AND password = :y");
					query.setParameter("x", userName);
					query.setParameter("y", password);	
				
					List<User> useri = query.getResultList();
				
				if(useri.isEmpty()) {
					sesija.getTransaction().rollback();
					return null;
				}else if(useri.size() == 1) {
					sesija.getTransaction().commit();
					return useri.get(0);
				}else {
					sesija.getTransaction().rollback();
					return null;
				}
			} catch (Exception e) {
				sesija.getTransaction().rollback();
				return null;
			}finally {
				sesija.close();
			}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
