package jdbc;
import java.sql.*;
public class FetchData {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
		
		  Statement s =c.createStatement();
		  ResultSet rs=s.executeQuery("select * from movie");
		  while(rs.next()) {
		 
		  System.out.println("ID="+rs.getInt(1));
		  System.out.println("NAME="+rs.getString(2));
		  System.out.println("HERO="+rs.getString(3));
		  System.out.println("HEROINE="+rs.getString(4));
		  System.out.println("VILLAN="+rs.getString(5));
		  System.out.println("COLLECTON="+rs.getDouble(6));
		  System.out.println("------------------------------");
		  } 
			 
		}
	catch (ClassNotFoundException | SQLException e){
		e.printStackTrace();
		
	}
}
	

}
