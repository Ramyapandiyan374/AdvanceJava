package Mappingonetoone;
import jakarta.persistence.*;
public class FirstWayDeletParent {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	PassPort p=em.find(PassPort.class,2345);
	
	et.begin();
	em.remove(p);
	et.commit();
	System.out.println("Deleted");
}
}
