package jdbc;
import java.sql.*;
import java.util.Scanner;
public class FetchById {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id");
	int id=sc.nextInt();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
		PreparedStatement ps=c.prepareStatement("select name,collection from movie where id=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("NAME="+rs.getString(1));
			System.out.println("CLLECTION="+rs.getDouble(2));
			
		}
		
		}
	catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
}

}
