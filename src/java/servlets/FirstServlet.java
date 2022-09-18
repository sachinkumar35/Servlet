package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

public class FirstServlet implements Servlet {
    
    // life cycle methods:
    ServletConfig conf;
    
//  THIS METHOD IS TO INITILISE THE SERVR OF METHODS
    public void init(ServletConfig conf)
    {
        this.conf = conf;
        System.out.println("creating object: ...");
    }
    
//  THIS METHOD IS TO PROCESS THE REQUEST WITCH COME BY SERVIC
    public void service(ServletRequest req, ServletResponse resp)throws ServletException, IOException
    {
        System.out.println("Servicing..........");
      //SET THE CONTENT TYPE OF RESPONSE 
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>this is my output from servlet method:</h1>");
        out.println("<h1>Todays date and time is"+new Date().toString()+"</h1");
        
    }
    
//  THIS METHOD TO DESTROY THE OBJECT 
    public void destroy()
    {
        System.out.println("destroy");
    }
    
//  NON LIFE CYCLE METHOD  
    public ServletConfig getServeletConfig()
    {
        return this.conf;
    }
    
    public String getServletInfo()
    {
        return "this servlet is ceated by Sachin Bhardwaj";
    }

    @Override
    public ServletConfig getServletConfig() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
