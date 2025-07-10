package product;
import java.sql.*;
import java.util.Scanner;
public class DynamicInsert {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the id");
	    int id=sc.nextInt();
	    System.out.println("Enter the name");
	    String name=sc.next();
        System.out.println("Enter the hero");
	    String hero=sc.next();
	    System.out.println("Enter the villan");
	    String villan=sc.next();
	    
	    System.out.println("Enter the heroine");
	    String heroine=sc.next();
	    System.out.println("Enter the collection");
	    double collection=sc.nextDouble();
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
	    	PreparedStatement ps=c.prepareStatement("insert into movie values(?,?,?,?,?,?)");
	    	ps.setInt(1, id);
	    	ps.setString(2, name);
	    	ps.setString(3, hero);
	    	ps.setString(4, heroine);
	    	ps.setString(5, villan);
	    	ps.setDouble(6, collection);
	    	ps.executeUpdate();
	    	System.out.println("Data inserted");
	    	
    }
	    catch (ClassNotFoundException |SQLException e){
	    	e.printStackTrace();
	    	
	    }
	}
  
  
}
