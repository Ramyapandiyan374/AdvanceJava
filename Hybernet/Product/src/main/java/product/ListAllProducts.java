package product;
import jakarta.persistence.*;
import java.util.*;
public class ListAllProducts {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
    Query q=em.createQuery("select f from Product f");
    List<Product>list=q.getResultList();
    for(Product l:list) {
    	System.out.println(l);
    }
}
}
