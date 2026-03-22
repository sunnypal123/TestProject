package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Car;

public class Update {
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();
	        
	        Car car = em.find(Car.class, 101);
	        
	        if(car !=null) {
	        	car.setPrice(200000);
	        	et.begin();
	        	em.persist(car);

	        	et.commit();
	        	
	        	
	        	System.out.println("updated");
	        	
	        }else {
	        	System.out.println("not found");
	        	
	   
	        }
	        
	        
	}

}
