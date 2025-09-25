package Mappingonetoone;
import jakarta.persistence.*;
public class DeleteParentSecondWay {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Student s=em.find(Student.class,2);
	PassPort p=s.getpassport();
	et.begin();
	em.remove(p);
	em.remove(s);
	et.commit();
	System.out.println("Deleted");
}
}
