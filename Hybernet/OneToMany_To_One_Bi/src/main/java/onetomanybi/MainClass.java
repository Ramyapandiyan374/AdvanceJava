package onetomanybi;
import jakarta.persistence.*;
import java.util.*;
public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Batch b=new Batch();
	b.setBcode("M20");
	b.setSubject("ADV JAVA");
	b.setTrainer("SURIYA");
	b.setTiming("2.00PM");
	b.setNoOfStudents(150);
   Student s1=new Student();
   s1.setName("Dor");
   s1.setGender("MALE");
   s1.setEmail("dora@gmail.com");
   s1.setPhno(64376472642l);
   s1.setBatch(b);
   Student s2=new Student();
   s2.setName("Dora");
   s2.setGender("MALE");
   s2.setEmail("dora@gmail.com");
   s2.setPhno(64376472642l);
   s2.setBatch(b);
   Student s3=new Student();
   s3.setName("Dora");
   s3.setGender("MALE");
   s3.setEmail("dora@gmail.com");
   s3.setPhno(64376472642l);
   s3.setBatch(b);
   
   
   List<Student>a1=new ArrayList<>();
   a1.add(s1);
   a1.add(s2);
   a1.add(s3);
   b.setStudents(a1);
   et.begin();
   em.persist(b);
   et.commit();
   System.out.println("Data saved");
   
   
   
   
}
}
