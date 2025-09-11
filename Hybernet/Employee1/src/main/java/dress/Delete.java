package dress;
import jakarta.persistence.*;
public class Delete {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Dress d=em.find(Dress.class, 3);
	et.begin();
	em.remove(d);
	et.commit();
	System.out.println("Deleted");
}
}
