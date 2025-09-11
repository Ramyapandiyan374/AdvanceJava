package food;
import jakarta.persistence.*;
import java.util.*;
public class JpqlQuery {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select f from Food f");
	List <Food> list=q.getResultList();
	for(Food food:list) {
		System.out.println(food);    
	}
	
}
}
