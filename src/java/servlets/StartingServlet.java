
package servlets;

import java.io.IOException;
import javax.servlet.*;


public class StartingServlet implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
     
    }

    @Override
    public ServletConfig getServletConfig() {
    
        return null;
    
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
   
        System.out.println("Servic method");
    }

    @Override
    public String getServletInfo() {
    
        return null;
    
    }

    @Override
    public void destroy() {
   
    }
    
    
    
}
