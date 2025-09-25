package Mappingonetoone;
import jakarta.persistence.*;
public class UpdatePassport {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	PassPort p=em.find(PassPort.class,1234);
	p.setNationality("Korean");
	et.begin();
	em.merge(p);
	et.commit();
	System.out.println("Updated");
}
}
