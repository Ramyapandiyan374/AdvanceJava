package book;
import java.sql.*;
import java.util.Scanner;
public class AvailbelBooks {
static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the available");
	boolean available=sc.nextBoolean();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","root");
		PreparedStatement ps=c.prepareStatement("select * from book where available=?");
		ps.setBoolean(1, available);
		
		ResultSet rs=ps.executeQuery();
	   while(rs.next()) {
		   if(available==true) {
			   System.out.println("Id :"+rs.getInt(1));
				System.out.println("Title :"+rs.getString(2));
				System.out.println("Author :"+rs.getString(3));
				System.out.println("Published year :"+rs.getInt(4));
				System.out.println("Available :"+rs.getInt(5));
				System.out.println("Genre :"+rs.getString(6));
				System.out.println("===============================");
		   }
	   }
		
	} catch (ClassNotFoundException |SQLException e) {
		e.printStackTrace();
	}
}
}
