package onetomany;
import jakarta.persistence.*;
public class FetchBus {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Bus b=em.find(Bus.class, "TN0eT34JI34");
	System.out.println(b);
}
}
