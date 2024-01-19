package projectOne;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


public class First extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		System.out.println("print on console........");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("userName");
		
		out.println("<h2>Name:"+name+"</h2>");
		out.print("<h3>hello.. this is get method <h3>");
		
	}
}
