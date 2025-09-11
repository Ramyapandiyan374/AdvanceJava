package dress;
import jakarta.persistence.*;
public class Fetch {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Dress d=em.find(Dress.class,1);
	System.out.println(d);
	
}
}
