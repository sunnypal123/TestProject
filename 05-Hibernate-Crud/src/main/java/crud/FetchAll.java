package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Sunny;

public class FetchAll {
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	        EntityManager em = emf.createEntityManager();          // ✅ correct type
	       // EntityTransaction  = em.getTransaction();
	        
	        
	        String hql ="SELECT sunny FROM Sunny sunny WHERE sunny.design=?1 AND sunny.name=?2";
	        Query q = em.createQuery(hql);
	        q.setParameter(1, "software eng");
	        q.setParameter(2, "suraj");
	        
	        List<Sunny> sunny = q.getResultList();
	        
	        Sunny Sunny = em.find(Sunny.class, 101);
	        
	        if(sunny !=null) {
	        	System.out.println("------Sunny------");
	        	System.out.println("ID :" + Sunny.getId());
	        	System.out.println("NAME :" + Sunny.getName());
	        	System.out.println("DESIGNATION :" + Sunny.getDesign());
	        	System.out.println("SALARY :" + Sunny.getSalary());

	        }else {
	        	System.out.println("system not found");
	        }
	        
	        

	}

}
