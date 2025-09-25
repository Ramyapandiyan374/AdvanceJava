package Mappingonetoone;
import jakarta.persistence.*;
public class ThirdWayDeletingParent {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Student s=em.find(Student.class,1);
	s.setpassport(null);
	System.out.println(s);
//	et.begin();
//	em.merge(s);
//	et.commit();
}
}
