package product;
import jakarta.persistence.*;
public class MainMethod {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Product p=new Product();
	p.setId(4);
	p.setName("Laptop");
	p.setPrice(45000);
	p.setCategory("Lenova");
	p.setQuantity(2);
et.begin();
em.persist(p);
et.commit();
}
}
