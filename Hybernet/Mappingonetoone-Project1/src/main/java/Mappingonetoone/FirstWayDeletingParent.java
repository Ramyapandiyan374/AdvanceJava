package Mappingonetoone;
import jakarta.persistence.*;
public class FirstWayDeletingParent {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Student s=em.find(Student.class,3);
	
	et.begin();
	em.remove(s);
	et.commit();
	System.out.println("Deleted");
}
}
