package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Car;
import entity.Engine;

public class Save {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction(); 	
		
		
		
	   Car car = new Car();
	   car.setCid(102);
	   car.setName("audi");
	   car.setPrice(800000);
	   
	   
	   System.out.println("------------engine--------");
	   
	   Engine e = new Engine();
	   
	   e.setEid(3);
	   e.setCc(2200);
	   
	   car.setEngine(e);
	   
	   
	   et.begin();
	   em.persist(e);
	   em.persist(car);
	   et.commit();
	   
	   
	   
	
		
		
	}
	

}
