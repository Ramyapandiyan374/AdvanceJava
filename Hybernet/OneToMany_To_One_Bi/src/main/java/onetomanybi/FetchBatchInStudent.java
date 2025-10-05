package onetomanybi;
import jakarta.persistence.*;
import java.util.*;
public class FetchBatchInStudent {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Batch b=em.find(Batch.class,"M20" );
	System.out.println(b);
	List<Student> s=b.getStudents();
	for(Student f:s) {
		System.out.println(f);
	}
		
}
}
