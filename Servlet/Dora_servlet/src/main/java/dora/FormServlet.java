package dora;
import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;

import javax.servlet.*;
public class FormServlet  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String gender=req.getParameter("gender");
		PrintWriter out=res.getWriter();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletuser_db","root","root");
			PreparedStatement ps=c.prepareStatement("insert into servletuser values(?,?,?,?)");
			ps.setInt(1, Integer.parseInt(id));
			ps.setString(2, name);
			ps.setInt(3,Integer.parseInt(age));
			ps.setString(4,gender);
			ps.executeUpdate();
			out.print("<h1>Data saved</h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
