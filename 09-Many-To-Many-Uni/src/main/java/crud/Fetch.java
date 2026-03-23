package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import entity.Actors;
import entity.Movies;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Movies movie = em.find(Movies.class, 101);

		if (movie != null) {
			System.out.println("-------Movie--------");
			System.out.println(movie.getMid());
			System.out.println(movie.getName());

			List<Actors> actors = movie.getActors();
			System.out.println("------Actors------");
			for (Actors actor : actors) {
				System.out.println(actor.getAid());
				System.out.println(actor.getName());
				System.out.println(actor.getGender());
				System.out.println("-------------");
			}

		} else {
			System.out.println("not found");
		}
	}
}