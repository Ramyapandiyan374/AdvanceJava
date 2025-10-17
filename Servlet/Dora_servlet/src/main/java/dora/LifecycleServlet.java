package dora;
import java.io.IOException;

import javax.servlet.*;
public class LifecycleServlet extends GenericServlet {
@Override
public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException {
	System.out.println("This is service method");
}
@Override
public void init() {
	System.out.println("This is init method");
}
@Override
public void destroy() {
	System.out.println("This is destroy method");
}
}
