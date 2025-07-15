package jdbc;
import java.sql.*;
public class ExecuteDrop {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
        Statement s=c.createStatement();
        s.execute("drop table movie");
        System.out.println("table droppped");
        
        
	}
	catch (ClassNotFoundException | SQLException e){
		e.printStackTrace();
		
	}

}
}
