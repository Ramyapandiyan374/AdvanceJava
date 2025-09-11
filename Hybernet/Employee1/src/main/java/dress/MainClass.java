package dress;
import jakarta.persistence.*;
public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Dress d=new Dress();
	d.setSno(3);
	d.setName("Shirt");
	d.setPrice(13000);
	d.setRating(10);
	d.setLocation("Kanchipuram");
	et.begin();
	em.persist(d);
	et.commit();
	System.out.println("Data saved");
}
}
