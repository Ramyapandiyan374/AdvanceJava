package book;
import java.sql.*;
import java.util.Scanner;
public class BookAvailable {
static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	
	System.out.println("Enter the id");
	int id=sc.nextInt();
	System.out.println("Enter the availability");
	boolean available=sc.nextBoolean();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","root");
		PreparedStatement ps=c.prepareStatement("update book set available=? where id=?");
		ps.setBoolean(1, available);
		ps.setInt(2, id);
		ps.executeUpdate();
		System.out.println("Updated");
		
	} catch (ClassNotFoundException |SQLException e) {
		e.printStackTrace();
	}
	
	
	
	
}
}
