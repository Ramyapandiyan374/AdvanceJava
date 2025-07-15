package jdbc;
import java.sql.*;
public class ExecuteCreate {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
        Statement s=c.createStatement();
        s.execute("create table movie(mname varchar(25),hero varchar(25),herione varchar(25))");
        
        System.out.println("table created");
        
        
	}
	catch (ClassNotFoundException | SQLException e){
		e.printStackTrace();
		
	}

}
}
