package onetomany;
import jakarta.persistence.*;
public class FetchPassenger {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Passenger p=em.find(Passenger.class, 5);
	System.out.println(p);
}
}
