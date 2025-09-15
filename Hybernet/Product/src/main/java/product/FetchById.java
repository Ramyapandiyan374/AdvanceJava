package product;
import jakarta.persistence.*;
import java.util.*;
public class FetchById {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
    EntityTransaction et=em.getTransaction();
    Product p=em.find(Product.class,3);
    if(p!=null) {
    	System.out.println(p);
    }
}
}
