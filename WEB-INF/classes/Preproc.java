import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Preproc extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		int c=0;
		String sname=req.getParameter("NAME");
		HttpSession session=req.getSession(true);
        session.setAttribute("NAME",sname);
		session.setAttribute("count",c);
		res.sendRedirect("FirstQuestion.html");
	}
}