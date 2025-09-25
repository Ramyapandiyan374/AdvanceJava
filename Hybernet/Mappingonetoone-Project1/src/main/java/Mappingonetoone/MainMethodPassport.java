package Mappingonetoone;
import jakarta.persistence.*;
public class MainMethodPassport {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	 PassPort p=new PassPort();
	 p.setPno(1245);
	 p.setNationality("TamilNadu");
	 p.setIssuedate("01-10-2020");
	 p.setExpirydate("10-02-2030");
     Student s=new Student();
	 s.setId(1);
	 s.setSname("Kaliya");
	 s.setpassport(p);
	 et.begin();
	 em.persist(s);
	 et.commit();
	 System.out.println("Data saved");
	 
}
}
