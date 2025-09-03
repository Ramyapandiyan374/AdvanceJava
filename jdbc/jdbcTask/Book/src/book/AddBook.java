package book;
import java.sql.*;
import java.util.Scanner;
public class AddBook {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	try {
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the title");
		String title=sc.next();
		System.out.println("Enter the author");
		String author=sc.next();
		System.out.println("Enter the publishedyear");
		int year=sc.nextInt();
		System.out.println("Enter the available");
		boolean available=sc.nextBoolean();
		System.out.println("Enter the genre");
		String genre=sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","root");
		PreparedStatement ps=c.prepareStatement("insert into book values(?,?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, title);
		ps.setString(3, author);
		ps.setInt(4,year);
		ps.setBoolean(5, available);
		ps.setString(6, genre);
		ps.executeUpdate();
		System.out.println("Data insered");
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
	
}
}
