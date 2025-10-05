package manytoone;
import jakarta.persistence.*;
public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Team t=em.find(Team.class,1);
//	t.setName("Squid Game");
//	t.setCountry("Korea");
//	t.setSports("Dolgami");
//	t.setCoach("No 456");
//	t.setColor("Green");
//	
	Player p1=new Player();
	p1.setName("Bheem");
	p1.setAge(10);
	p1.setTeam(t);
	p1.setJno(23);
	p1.setRole("Player");
	p1.setSal(134444);
	
	
//	Player p1=new Player();
//	p1.setName("Bheem");
//	p1.setAge(10);
//	p1.setTeam(t);
//	p1.setJno(23);
//	p1.setRole("Player");
//	p1.setSal(134444);
//	Player p1=new Player();
//	p1.setName("Bheem");
//	p1.setAge(10);
//	p1.setTeam(t);
//	p1.setJno(23);
//	p1.setRole("Player");
//	p1.setSal(134444);
	
	
	
	
	et.begin();

	em.persist(p1);
	
	et.commit();
	System.out.println("Data inserted");
	
}
}
