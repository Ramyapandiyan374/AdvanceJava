package food;
import jakarta.persistence.*;
public class Delete {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Food f=em.find(Food.class,3);
	if(f!=null) {
		et.begin();
		em.remove(f);
		et.commit();
		System.out.println("Data deleted");
	}
		else {
			System.out.println("id not found");
		}
		
	}
}

