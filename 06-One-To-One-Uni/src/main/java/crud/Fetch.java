package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Car;
import entity.Engine;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        
        Car car = em.find(Car.class, 103);
        
        if(car !=null) {
        	System.out.println("CID  "+ car.getCid());
        	System.out.println("BRAND "+ car.getBrand());
        	System.out.println("Price "+ car.getPrice());
        	
        	
        	
        	System.out.println("-------engine-------");
        	
        	Engine engine = car.getEngine();
        	System.out.println("EID  "+ engine.getEid());
        	System.out.println("CC "+ engine.getCc());
        }
        else {
        	System.out.println("not found");
        	
        }
        
            
	}

}
