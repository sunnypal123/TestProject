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
		
		
		Car car = em.find(Car.class,102);
		
		if(car !=null) {
			car.setName("sunny");
			car.setPrice(500000);
			
			et.begin();
			em.persist(car);
			et.commit();
			
		}else {
			System.out.println("not found");
			
		}

		
	}
	
	

}
