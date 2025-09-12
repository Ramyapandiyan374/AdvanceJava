package food;
import jakarta.persistence.*;
public class GetSingleResult {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select f from Food f where f.fname='Biryani'");
	Object o=q.getSingleResult();
	Food f=(Food)o;
	System.out.println(f);
	
	
}
} 
