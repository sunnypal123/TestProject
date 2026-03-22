package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Sunny;

public class Delete {
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	        EntityManager em = emf.createEntityManager();          // ✅ correct type
	        EntityTransaction et = em.getTransaction();
	        
	        Sunny sunny = em.find(Sunny.class, 101); 
	        
	        if(sunny!=null) {
	        	et.begin();
	        	em.persist(sunny);
	        	et.commit();
	        	
	        	System.out.println("Deleted");
	      
	        }else {
	        	System.out.println("not found");
	        }

		
		
	}

}
