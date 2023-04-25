/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyServlet;
import jakarta.servlet.*;

/**
 *
 * @author Marshall
 */
import java.io.IOException;import java.io.PrintWriter;
/**
 *
 * @author Marshall
 */
public class genericwala extends GenericServlet{

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
                sr1.setContentType("text/html");
        PrintWriter out=sr1.getWriter();
        out.println("this is generic");

    }
    
}
