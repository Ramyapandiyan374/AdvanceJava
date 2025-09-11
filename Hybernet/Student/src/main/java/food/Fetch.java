package food;
import jakarta.persistence.*;
public class Fetch {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Food f=em.find(Food.class,1);
	if(f!=null) {
		System.out.println(f);
	}
}
}
