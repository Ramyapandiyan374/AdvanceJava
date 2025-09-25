package Mappingonetoone;
import jakarta.persistence.*;
public class UpdateStudent {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Student s=em.find(Student.class,1);
	PassPort p=em.find(PassPort.class,1245);

	s.setpassport(p);
	et.begin();
	em.merge(s);
	et.commit();
	System.out.println("Updated");
}
}
