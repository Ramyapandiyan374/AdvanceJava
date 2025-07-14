package jdbc;
import java.sql.*;
public class fetch {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
		
		  Statement s =c.createStatement();
		  ResultSet rs=s.executeQuery("select * from movie");
		  System.out.println(rs.next());
		  System.out.println(rs.next());
		  System.out.println(rs.next());
		  System.out.println(rs.next());
		  
		
	}
	catch (ClassNotFoundException | SQLException e){
		e.printStackTrace();
		
	}
}

}
