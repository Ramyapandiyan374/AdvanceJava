package mappingOneToOneBi;
import jakarta.persistence.*;
public class MainMethod {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	AdharCard a=new AdharCard();
	a.setAno(19765656734l);
	a.setFathername("Buhar");
	a.setAddress("Guindy																																			");
	
	Person p=new Person();
	p.setName("Butji");
	p.setGender("Female");
	p.setEmail("butji@gmail.com");
	p.setPno(9876543223l);
	p.setAdharcard(a);
	a.setPerson(p);
	et.begin();
	em.persist(a);
	em.persist(p);
	et.commit();
	System.out.println("Data saved");
	
	
	
	
}
}
