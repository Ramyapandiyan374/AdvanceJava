package onetomanybi;
import jakarta.persistence.*;

public class FetchStudentInBatch {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Student s=em.find(Student.class, 1);
	Batch b=s.getBatch();
	System.out.println(b);
	System.out.println(b.getStudents());
}
}
