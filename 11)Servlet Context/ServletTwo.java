import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletTwo extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res){
    try{
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    ServletContext context=getServletContext();  
    String name=(String)context.getAttribute("name");  
  
    out.println("Welcome "+name);  
    out.close();

         }catch(Exception e){System.out.println(e);}
    }


}
