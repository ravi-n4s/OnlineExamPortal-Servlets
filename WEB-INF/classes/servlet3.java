import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class servlet3 extends HttpServlet
{
      public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	   {   
		  HttpSession session=req.getSession(true);
		  int c=Integer.valueOf((String)session.getAttribute("count"));
		  if(req.getParameter("NAME").equals("TRUE"))
	       c++;
		  session.setAttribute("count",c);
		  res.sendRedirect("FourthQuestion.html");
		}
} 