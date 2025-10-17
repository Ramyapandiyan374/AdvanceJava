package dora;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DynamicServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		Date d=new Date();
		String html="<html>"
				+ "<body>"
				+ "<h1>Current date and time="+d+" </h1>"
				+ "</body>"
				+ "</html>";
		PrintWriter out=res.getWriter();
		out.print(html);
	}

}
