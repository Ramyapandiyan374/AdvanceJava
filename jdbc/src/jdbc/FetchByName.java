package jdbc;
import java.sql.*;
import java.util.Scanner;
public class FetchByName {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=sc.next();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
		PreparedStatement ps=c.prepareStatement("select * from movie where name like ?");
		ps.setString(1,"%"+name+"%");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("ID="+rs.getInt("id"));
			System.out.println("NAME="+rs.getString("name"));
			System.out.println("COLLECTION="+rs.getDouble("collection"));
			System.out.println("VILLAN="+rs.getString("villan"));
			System.out.println("HERO="+rs.getString("hero"));
			System.out.println("HEROINE="+rs.getString("herione"));
			


			
		}
	}
	catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
