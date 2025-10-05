package onetomanybi;
import jakarta.persistence.*;
public class Delete {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction  et=em.getTransaction();
	Batch b=em.find(Batch.class, "M20");
	Student s=em.find(Student.class, 4);
	b.removeStudent(s);
	et.begin();
	em.merge(b);
	em.remove(s);
	et.commit();
}
}
