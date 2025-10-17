package com;
import javax.servlet.*;
import java.io.IOException;
public class LifecycleServlet extends GenericServlet{
@Override
public void service(ServletRequest req,ServletResponse res) throws ServletException{
	System.out.println("This is service method");
}
@Override
public void init() {
	System.out.println("This is init method");
}
@Override
public void destroy() {
	System.out.println("This is destry method");
}
}
