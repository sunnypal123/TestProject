package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Sunny;

public class Update {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
	Sunny sunny = em.find(Sunny.class ,107);
	
	if(sunny !=null) {
		sunny.setSalary(80000);
		et.begin();
		em.persist(sunny);
		et.commit();
		
		System.out.println("Salary updated");
		
	}else {
		System.out.println("employee not found");
	}
		
	}

}
