package com;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class StaticServlet  extends GenericServlet{
@Override
public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException {
	String html="<html><body><h1>This is Demo static Servlet</h1></body></html>";
	PrintWriter out=res.getWriter();
	out.print(html);
	
}
}
