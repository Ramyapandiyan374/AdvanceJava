package Mappingonetoone;
import jakarta.persistence.*;
public class DeleteParentInThirdWay {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	PassPort p=em.find(PassPort.class,1345);
	if(p!=null) {
		et.begin();
		em.remove(p);
		et.commit();
	}
	
	System.out.println("Deleted");
}
}
