// importing the javax.servlet package
// importing java.io package for PrintWriter
import javax.servlet.*;
import java.io.*;

// now creating a servlet by implementing Servlet interface
public class LifeCycleServlet implements Servlet {

	ServletConfig config = null;

	// init method
	public void init(ServletConfig sc)
	{
		config = sc;
		System.out.println("in init");
	}

	// service method
	public void service(ServletRequest req, ServletResponse res)
		throws ServletException, IOException
	{
		res.setContenttype("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h2>hello from life cycle servlet</h2>");
		System.out.println("in service");
	}

	// destroy method
	public void destroy()
	{
		System.out.println("in destroy");
	}
	public String getServletInfo()
	{
		return "LifeCycleServlet";
	}
	public ServletConfig getServletConfig()
	{
		return config; // getServletConfig
	}
}
