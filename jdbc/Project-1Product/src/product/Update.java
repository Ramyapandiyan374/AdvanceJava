package product;
import java.sql.*;
public class Update {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
	     Statement s=c.createStatement();
	     s.executeUpdate("update product set Quantity=7,price=600 where id=2");
	     System.out.println("data updataed ");
	}
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
