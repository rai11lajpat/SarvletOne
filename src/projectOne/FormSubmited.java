package projectOne;
import java.io.*;
import java.io.PrintWriter;
import java.security.spec.PSSParameterSpec;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Scanner;

	public class FormSubmited extends HttpServlet {
		public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
		{
			System.out.println("print on console........");
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			InsertInDb a=new InsertInDb();
		
			a.name=request.getParameter("userName");
			a.fName=request.getParameter("fName");
			a.depart=request.getParameter("depart");
			a.rollNo=request.getParameter("rollNo");
			a.email=request.getParameter("email");
			a.gender=request.getParameter("gender");
			//image
			a.adr=request.getParameter("adr");
			a.update();
			
			
			String cone=request.getParameter("condition");
			
			
			if(cone!=null){
				if(cone.equals("chacked")){
					
					//forword
					RequestDispatcher rd=request.getRequestDispatcher("SuccessForm");
					rd.forward(request, response);
					
				}else{
					out.println("<h2>You have not accepted terms and conditions<h2>");
				}
			}else{
				out.println("<h2>You have not accepted terms and conditions<h2>");
				
				
				//include
				RequestDispatcher rd=request.getRequestDispatcher("form.jsp");
				rd.include(request,response);
				
			}
			
			
			
				
		}
	
	
	}


