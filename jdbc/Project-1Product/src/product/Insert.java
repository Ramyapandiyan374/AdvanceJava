package product;
import java.sql.*;
public class Insert {
public static void main(String[] args) {
	try {
		//first step
		Class.forName("com.mysql.cj.jdbc.Driver");
		//second step
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
		//Third step
		  Statement s =c.createStatement();
		  //fourth step
		  s.executeUpdate("insert into product values(1,'Perfume','fox',500,5,3)");
		  s.executeUpdate("insert into product values(2,'StoryBooks','Crow',600,5,4)");
		  s.executeUpdate("insert into product values(3,'Bags','Hero',1200,5,3)");
		  
		  System.out.println("Data inserted");
		
	}
	catch (ClassNotFoundException | SQLException e){
		e.printStackTrace();
		
	}
}
}
