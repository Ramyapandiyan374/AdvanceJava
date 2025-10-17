package dora;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class Loginservlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		String html="<html><body><h1>Email="+email+"<h1>Pssword="+pass+"</h1></h1></body></html>";
				
		PrintWriter out=res.getWriter();
		out.print(html);
		
	}

}
