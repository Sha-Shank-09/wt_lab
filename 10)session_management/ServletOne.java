import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletOne extends HttpServlet
 {

  public void doPost(HttpServletRequest req, HttpServletResponse res)
  {
    try{

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    String name=req.getParameter("name");
    out.print("Hi "+name);
    name=name+" 2";
    out.print("<br/>");
    HttpSession session=req.getSession();
    session.setAttribute("name",name);
    out.print("<a href='servlettwo'>go</a>");

    out.close();

        }catch(Exception e){System.out.println(e);}
  }
}
