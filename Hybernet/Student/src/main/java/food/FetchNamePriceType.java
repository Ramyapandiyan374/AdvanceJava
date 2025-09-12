package food;
import java.util.List;

import jakarta.persistence.*;
public class FetchNamePriceType {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select f.fname,f.price,f.type from Food f");
	List <Object[]>list=q.getResultList();
	for(Object[]o:list) {
		System.out.println("Name="+o[0]+", price="+o[1]+", Type="+o[2]);
	}
}
}
