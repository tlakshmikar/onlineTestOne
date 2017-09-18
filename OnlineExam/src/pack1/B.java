package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/quiz")
public class B extends HttpServlet
{
	protected void  doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException 
	{
		PrintWriter out=res.getWriter();
		int count = 0;
		String a1="blue";
		String aa1=req.getParameter("answer1");
		if(a1.equals(aa1))
		{
			out.println();
			count++;
		}
		String a2="five";
		String aa2=req.getParameter("answer2");
		if(a2.equals(aa2))
		{
			count++;
		}
		String a3="dog";
		String aa3=req.getParameter("answer3");
		if(a3.equals(aa3))
		{
			count++;
		}
		String a4="Halloween";
		String aa4=req.getParameter("answer4");
		if(a4.equals(aa4))
		{
			count++;
		}
		out.println("<form action='test.jsp'>");
		out.println(count+"/4");
		out.println("</form>");
		
		
	}

}
