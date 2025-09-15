package product;
import jakarta.persistence.*;
import java.util.*;
public class SortByPriceHighToLow {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select f.price from Product f ORDER BY f.price DESC");
	List<Double>list=q.getResultList();
	System.out.println(list);
}
}
