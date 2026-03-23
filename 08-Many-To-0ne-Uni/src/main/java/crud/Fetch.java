package crud;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Product;
import entity.Review;

public class Fetch {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Review r = em.find(Review.class, 1);

		
	if(r !=null) {
		System.out.println("----------Review---------");
	
		System.out.println("rid : " + r.getRid());
		System.out.println("MSG : " + r.getMsg());
		

		Product p = em.find(Product.class, 1);

		System.out.println("pid : " + p.getPid());
		System.out.println("name : " + p.getName());

		System.out.println("Price : " + p.getPrice());
				

	}
	else {
		System.out.println("not found ");
	}
		
	}

}
