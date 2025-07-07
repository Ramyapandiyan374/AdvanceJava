package jdbc;
import java.sql.*;
public class ThirdFourthStep {
public static void main(String[] args) {
	
	try {
		//first step
		Class.forName("com.mysql.cj.jdbc.Driver");
		//second step
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
		//Third step
		  Statement s =c.createStatement();
		  //fourth step
		  s.executeUpdate("insert into movie values(1,'ramya','Doran','Dora','Dori',200000)");
		  System.out.println("Data saved");
		
	}
	catch (ClassNotFoundException | SQLException e){
		e.printStackTrace();
		
	}
}
}
