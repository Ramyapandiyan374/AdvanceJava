package jdbc;
import java.sql.*;
public class SecondStep {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");
		System.out.println("connection established");
	}
	catch (ClassNotFoundException | SQLException e){
		e.printStackTrace();
	}
}
}
