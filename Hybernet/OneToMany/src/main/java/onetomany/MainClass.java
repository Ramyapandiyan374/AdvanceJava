package onetomany;
import jakarta.persistence.*;
import java.util.*;
public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Passenger p1=new Passenger();
	p1.setName("Chukki");
	p1.setGender("Female");
	p1.setPhoneno(123467965l);
	p1.setAge(15);
	p1.setBoarding("Dolukpur");
	
	p1.setDestination("India");
	Bus b=em.find(Bus.class,"TN0eT34JI34");
	b.addPassenger(p1);
	et.begin();
	em.persist(b);
	et.commit();
	System.out.println("Data Saved");
}
}
