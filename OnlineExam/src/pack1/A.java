package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/userr")
public class A extends HttpServlet
{
	protected void  doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException 
	{
		String name=req.getParameter("name");
		String pass=req.getParameter("passs");
		PrintWriter out=res.getWriter();
		if(pass.equals("admin"))
		{
			RequestDispatcher rs=req.getRequestDispatcher("/test.jsp");
			rs.forward(req, res);
		}
		else
		{
			out.println("enter correct message");
			RequestDispatcher rs=req.getRequestDispatcher("/user.jsp");
			rs.include(req, res);
		}
	}
	

}
