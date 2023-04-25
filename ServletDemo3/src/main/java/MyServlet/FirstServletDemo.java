/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyServlet;

import jakarta.servlet.*;
import java.io.*;
//import javax.servlet.*;
/**
 *
 
 */
public class FirstServletDemo implements Servlet {

    @Override
    public void init(ServletConfig sc) throws ServletException {
        
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.getServletConfig();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("this is  a servlet page");
    }

    @Override
    public String getServletInfo() {
        return "random";
    }

    @Override
    public void destroy() {
        
    }
    
}