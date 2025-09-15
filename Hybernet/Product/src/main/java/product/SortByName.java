package product;
import jakarta.persistence.*;
import java.util.*;
public class SortByName {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select f.name orderBy from Product f ORDER BY f.name");
	List<String>list=q.getResultList();
	System.out.println(list);
}
}
