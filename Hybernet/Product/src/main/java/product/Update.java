package product;
import jakarta.persistence.*;
public class Update {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Product p=em.find(Product.class,4);
	p.setQuantity(3);
	et.begin();
	em.merge(p);
	et.commit();
}
}
