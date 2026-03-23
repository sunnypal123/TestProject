package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Product;
import entity.Review;

public class save {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Product p = new Product();
		
		p.setPid(1);
		p.setName("mobile");
		p.setPrice(30000);
		
		
		
		Review r = new Review();
		r.setRid(11);
		r.setMsg("good");
		r.setProduct(p);
		
		Review r2 = new Review();
		r2.setRid(14);
		r2.setMsg("bad");
		r2.setProduct(p);
		
		
		Review r3 = new Review();
		r3.setRid(8);
		r3.setMsg("avrage");
		r3.setProduct(p);
		
		
		et.begin();
		em.persist(p);
		em.persist(r);
		em.persist(r2);
		em.persist(r3);

		et.commit();
		
		
		
		
		
		
	}

}
