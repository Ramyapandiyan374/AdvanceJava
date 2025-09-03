package book;
import java.sql.*;

import java.util.*;

public class Sort {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
//	System.out.println("Enter the tilte");
//    String title=sc.next();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","root");
       Statement  s =c.createStatement();
    
       ResultSet rs=s.executeQuery("select title from book");
       Set<String>set=new TreeSet<>();
       
       
		while(rs.next()) {
			;
			String a=rs.getString(1);
			set.add(a);
			
		}
		
		System.out.println(set);
		
		
		
		
	} catch (ClassNotFoundException |SQLException e) {
		e.printStackTrace();
	}
}
}
