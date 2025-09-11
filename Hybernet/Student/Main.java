package com;
import java.persistence.*;


public class Main {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Food f=new Food();
	f.setFid(1);
	f.setName("Biryani");
	f.setPrice(150);
	f.setRating(5);
	f.setType("Non-Veg");
	et.begin();
	em.persist(f);
	et.commit();
System.out.println("Saved");
}
}
