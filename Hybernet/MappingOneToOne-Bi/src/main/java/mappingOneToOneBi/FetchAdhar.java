package mappingOneToOneBi;
import jakarta.persistence.*;
public class FetchAdhar {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	AdharCard a=em.find(AdharCard.class, 197656567);
	Person p=a.getPerson();
	System.out.println(a);
	System.out.println(p);
}
}
