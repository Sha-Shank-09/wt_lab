import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletTwo extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res){
    try{
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    HttpSession session=req.getSession(false);
    String name=(String)session.getAttribute("name");
    out.print("Hello "+name);
    out.close();

         }catch(Exception e){System.out.println(e);}
    }


}
