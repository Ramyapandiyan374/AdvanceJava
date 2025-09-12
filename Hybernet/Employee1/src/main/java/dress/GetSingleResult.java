package dress;

import jakarta.persistence.*;
public class GetSingleResult {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select f from Dress f where f.dname='Chudi'");
	Object o=q.getSingleResult();
	Dress d=(Dress)o;
	System.out.println(d);
	
}
}
