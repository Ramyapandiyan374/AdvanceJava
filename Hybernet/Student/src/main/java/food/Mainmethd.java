package food;
import jakarta.persistence.*;
public class Mainmethd {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Food f=new Food();
	f.setId(4);
	f.setName("Egg Biryani");
	f.setPrice(150);
	f.setRating(8);
	f.setType(" Non veg");
	et.begin();
	em.persist(f);
	et.commit();
	System.out.println("Saved");
}
}
