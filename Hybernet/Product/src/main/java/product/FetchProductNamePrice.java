package product;
import jakarta.persistence.*;
import java.util.*;
public class FetchProductNamePrice {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select f.name,f.price from Product f");
	List<Object[]>list=q.getResultList();
	for(Object[]o:list) {
		System.out.println("Name="+o[0]+","+"Price="+o[1]);
	}
}
}
