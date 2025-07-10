package jdbc;
import java.sql.*;
import java.util.Scanner;
public class DynaminWayDeleteData {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id");
	int id=sc.nextInt();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
		PreparedStatement ps=c.prepareStatement("delete from movie where id=?");
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("Data deleted");
	}
	catch (ClassNotFoundException | SQLException e){
		e.printStackTrace();
		
	}
}
}
