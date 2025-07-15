package student;
import java.sql.*;
public class FifthStep {
public static void main(String[] args) {
	Connection c=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
         Statement s=c.createStatement();
        s.executeUpdate("insert into movie values('Stong women','park','jk')");
        
        
        
	}
	catch (ClassNotFoundException | SQLException e){
		e.printStackTrace();
		
	}
	finally {
		try {
			if(c!=null) {
				c.close();
				System.out.println("File closed");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
}
