package jdbc;
import java.sql.*;
public class ExecuteInsert {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
        Statement s=c.createStatement();
//        boolean b=s.execute("insert into movie values('Strong women','parkbogum','parkboyoung')");
        boolean b=s.execute("select * from movie");
        System.out.println(b);
        
        
	}
	catch (ClassNotFoundException | SQLException e){
		e.printStackTrace();
		
	}


}
}
