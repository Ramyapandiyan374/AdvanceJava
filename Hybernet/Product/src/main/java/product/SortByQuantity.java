package product;
import jakarta.persistence.*;
import java.util.*;
public class SortByQuantity {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select f.quantity from Product f ORDER BY f.quantity");
	List<Double>list=q.getResultList();
	System.out.println(list);
}
}
