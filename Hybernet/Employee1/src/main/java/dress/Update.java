package dress;
import jakarta.persistence.*;
public class Update {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Dress d=em.find(Dress.class,1);
	d.setLocation("Delhi");
	et.begin();
	em.merge(d);
	et.commit();
	System.out.println("Updated");
	
	
}
}
