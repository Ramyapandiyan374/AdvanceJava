package jdbc;
import java.sql.*;
import java.util.Scanner;
public class BatchProcessing {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the count");
	int count=sc.nextInt();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
	    PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
	    for(int i=1;i<=count;i++) {
	    	System.out.println("Enter name");
	    	String name=sc.next();
	    	System.out.println("Enter email");
	    	String email=sc.next();
	    	System.out.println("Enter phone");
	    	Long phone=sc.nextLong();
	    	System.out.println("Enter batch");
	    	int batch=sc.nextInt();
	    	System.out.println("Enter degree");
	    	String degree=sc.next();
	    	System.out.println("Enter branch");
	    	String branch=sc.next();
	    	System.out.println("Enter Marks");
	    	Double marks=sc.nextDouble();
	    	
	    	
	    	
	    	ps.setString(1,name);
	    	ps.setString(2,email);
	    	ps.setLong(3,phone);
	    	ps.setInt(4,batch);
	    	ps.setString(5,degree);
	    	ps.setString(6,branch);
	    	ps.setDouble(7,marks);
	    	ps.addBatch();
	    	System.out.println("--------------------------------");
	   
	    
	    	
	    	
	    }
	    ps.executeBatch();
	    System.out.println("Data saved");
	    
	}
	catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
