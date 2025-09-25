package Mappingonetoone;
import jakarta.persistence.*;
public class FetchPassPort {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	PassPort p=em.find(PassPort.class,1234);
	System.out.println(p);
}
}
