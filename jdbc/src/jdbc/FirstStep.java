package jdbc;
import java.sql.*;
public class FirstStep {
	public static void main(String[] args) {
		//load or register Driver
		//1St way
		try {
			java.sql.Driver d=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			System.out.println("Completed");
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
	}
       
}
