package dress;
import jakarta.persistence.*;
import java.util.*;
public class FetchByName {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select f.dname from Dress f ");
	List <String>list=q.getResultList();
	System.out.println(list);
	
}
}
