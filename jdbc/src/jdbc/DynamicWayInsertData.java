package jdbc;
import java.sql.*;
public class DynamicWayInsertData {
 public static void main(String[] args) {
	 try {
			//first step
			Class.forName("com.mysql.cj.jdbc.Driver");
			//second step
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
			PreparedStatement ps=c.prepareStatement("insert into movie values(?,?,?,?,?,?)");
			ps.setInt(1,3);
			ps.setString(2,"kamali");
			ps.setString(3,"doras");
			ps.setString(4,"dorass");
			ps.setString(5,"dori");
			ps.setDouble(6,100);
			ps.executeUpdate();
			System.out.println("Data saved");
			
			
		}
		catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
			
		}
}
}
