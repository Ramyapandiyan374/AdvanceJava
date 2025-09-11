package food;
import jakarta.persistence.*;
public class Update {
    public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Food f=em.find(Food.class,2);
		if(f!=null) {
			f.setName("Chappathi");
			f.setPrice(50);
			et.begin();
			em.merge(f);
			et.commit();
			System.out.println("Data updated");
		}
		else {
			System.out.println("Id not found");
		}
	}
}
