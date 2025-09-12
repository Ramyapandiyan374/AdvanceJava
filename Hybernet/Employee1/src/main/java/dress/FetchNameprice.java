package dress;
import jakarta.persistence.*;
import java.util.*;
public class FetchNameprice {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select f.dname,f.price,f.location from  Dress f");
	List<Object[]>list=q.getResultList();
	for(Object[]o:list) {
		System.out.println("Name="+o[0]+", Price="+o[1]+", Location="+o[2]);
	}
	
}
}
