package dress;
import jakarta.persistence.*;
import java.util.*;
public class JpqlQuery {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Query q=em.createQuery("select f from Dress f");
	List <Dress>list=q.getResultList();
	for(Dress dress:list) {
		System.out.println(dress);
	}
}
}
