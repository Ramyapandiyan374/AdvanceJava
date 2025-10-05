package mappingOneToOneBi;

import jakarta.persistence.*;
public class FetchPerson {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Person p=em.find(Person.class, 2);
	AdharCard a=p.getAdharcard();
	System.out.println(p);
	System.out.println(a);
}
}
