package onetomanybi;
import jakarta.persistence.*;
public class AddStudents {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction  et=em.getTransaction();
	Batch b=em.find(Batch.class, "M20");
	Student s1=new Student();
	s1.setName("Whity");
	s1.setGender("Female");
	s1.setPhno(32353454565l);
	s1.setEmail("whity@gmail.com");
	b.addStudent(s1);
	et.begin();
	em.merge(b);
	et.commit();
	
}
}
