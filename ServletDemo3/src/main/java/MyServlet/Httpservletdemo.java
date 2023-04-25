/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyServlet;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



/**
 *
 * @author Marshall
 */
public class Httpservletdemo extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
       
       res.setContentType("text/html");
       int num1 =  Integer.parseInt(req.getParameter("num1"));
       int num2 =  Integer.parseInt(req.getParameter("num2"));
       int sum = num1 + num2;
       PrintWriter out = res.getWriter();
       out .println(sum);
        
        
        
    }
    
}
