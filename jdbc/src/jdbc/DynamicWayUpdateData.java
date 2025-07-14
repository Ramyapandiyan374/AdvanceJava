package jdbc;
import java.sql.*;
import java.util.Scanner;
public class DynamicWayUpdateData {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the id");
		 int id=sc.nextInt();
		 System.out.println("Enter the hero");
		 String hero=sc.next();
		 System.out.println("Enter the collection");
		 Double collection=sc.nextDouble();
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
				PreparedStatement ps=c.prepareStatement("update movie set collection=?,hero=? where id=?");
				ps.setInt(3, id);
				ps.setDouble(1, collection);
				ps.setString(2, hero);
				ps.executeUpdate();
				System.out.println("Data updated");
			}
			catch (ClassNotFoundException | SQLException e){
				e.printStackTrace();
				
			}

	}
 
}
