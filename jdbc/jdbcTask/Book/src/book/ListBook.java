package book;
import java.sql.*;
public class ListBook {
public static void main(String[] args) {
	try {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","root");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select * from book");
		while(rs.next()) {
			System.out.println("Id :"+rs.getInt(1));
			System.out.println("Title :"+rs.getString(2));
			System.out.println("Author :"+rs.getString(3));
			System.out.println("Published year :"+rs.getInt(4));
			System.out.println("Available :"+rs.getInt(5));
			System.out.println("Genre :"+rs.getString(6));
			System.out.println("===============================");
		}
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
