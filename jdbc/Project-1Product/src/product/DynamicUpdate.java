package product;
import java.sql.*;
import java.util.Scanner;
public class DynamicUpdate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the id");
    int id=sc.nextInt();
    System.out.println("Enter the hero");
    String hero=sc.next();
    
    try {     
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
    	PreparedStatement ps=c.prepareStatement("update movie set hero=? where id=?");
    	ps.setInt(2, id);
    	ps.setString(1, hero);
    	ps.executeUpdate();
    	System.out.println("Data updated");
    	
}
    catch (ClassNotFoundException |SQLException e){
    	e.printStackTrace();
    	
    }
}
}
