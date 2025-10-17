package dora;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.*;
public class GetByIdServlet  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id=req.getParameter("id");
		PrintWriter out=res.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletuser_db","root","root");
		    PreparedStatement ps=c.prepareStatement("select * from servletuser where id=?");
		    ps.setInt(1, Integer.parseInt(id));
		    ResultSet rs=ps.executeQuery();
		    if(rs.next()) {
		    	out.print("<h1>Id="+id+"</h1>");
		    	out.print("<h1>Name="+rs.getString(2)+"</h1>");
		    	out.print("<h1>Age="+rs.getInt(3)+"</h1>");
		    	out.print("<h1>Gender="+rs.getString(4)+"</h1>");
		    }
		    else {
		    	out.print("<h1>Data is not found</h1>");
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
