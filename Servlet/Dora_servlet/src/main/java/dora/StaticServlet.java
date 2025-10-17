package dora;


import java.io.*;

import javax.servlet.*;
public  class StaticServlet extends GenericServlet {
	@Override
  public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
	  String html="<html><body><h1>Hai this static servlet</h1></body></html>";
	  PrintWriter out=res.getWriter();
	  out.print(html);
	  
  }
}
