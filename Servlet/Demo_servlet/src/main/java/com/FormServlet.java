package com;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class FormServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String phone=req.getParameter("phone");
		String html="<html>"
				+ "<body>"
				+ "<h1>Id="+id+"</h1>"
						+ "<h1>Name="+name+"</h1>"
						+ "<h1>Age="+address+"</h1>"
						+ "<h1>Gender="+phone+"</h1>"
						+ "</body>"
						+ "</html>";
		PrintWriter out=res.getWriter();
		out.print(html);
	}

}
