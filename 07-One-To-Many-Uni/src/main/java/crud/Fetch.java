package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Accounts;
import entity.Bank;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bank b = em.find(Bank.class, 1);
		
		if(b !=null) {
			System.out.println("--------bank--------");
			System.out.println("BID :" + b.getBid());
			

			System.out.println("NAME : "+ b.getName());

			System.out.println("IFSC : "+ b.getIfsc());
			
			List<Accounts> accs= b.getAccounts();

			System.out.println("-----accounts------");
			
			for(Accounts account :accs) {
				
				System.out.println("ACCOUNT NO : "+ account.getAccno());
				System.out.println("Name : " + account.getName());
				System.out.println("Balance :" + account.getBalance());
				
				
				


				
				
				
			}

		}else {
			System.out.println("not found");
		}

		
	}

}
