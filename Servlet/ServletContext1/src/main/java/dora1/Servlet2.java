package dora1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class Servlet2 extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ServletContext context=getServletContext();
		String email=context.getInitParameter("email");
		PrintWriter out=res.getWriter();
		out.print("<h1>Email="+email+"</h1>");
	}
}
