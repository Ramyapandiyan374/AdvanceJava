package jdbc;
import java.sql.*;
public class UpdateData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
		     Statement s=c.createStatement();
		     s.executeUpdate("update movie set villan='Doriman',collection=300000 where id=1");
		     System.out.println("data updataed ");
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
