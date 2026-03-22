package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Sunny;

public class Fetch {
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	        EntityManager em = emf.createEntityManager();          // ✅ correct type
	       // EntityTransaction  = em.getTransaction();
	        
	        Sunny sunny = em.find(Sunny.class, 101);
	        
	        if(sunny !=null) {
	        	System.out.println("------Sunny------");
	        	System.out.println("ID :" + sunny.getId());
	        	System.out.println("NAME :" + sunny.getName());
	        	System.out.println("DESIGNATION :" + sunny.getDesign());
	        	System.out.println("SALARY :" + sunny.getSalary());

	        }else {
	        	System.out.println("system not found");
	        }
	        
	        

	}

}
