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
			
			Engine e = em.find(Engine.class, 3);
			
			if(e!=null) {
				System.out.println("------engine----");
				System.out.println("eid :"+ e.getEid());
				System.out.println("cc :" + e.getCc());
				
				
				Car car = e.getCar();
				//System.out.println("cid :"+ car.getCid());
                System.out.println("cid   : " + car.getCid());    // ← fixed

	
				System.out.println("eid :"+ car.getName());
	
				System.out.println("eid :"+ car.getPrice());
	
				
				
				
			}else {
				System.out.println("not found");
			}
		}
	
	}
