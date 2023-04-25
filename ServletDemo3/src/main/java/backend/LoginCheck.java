/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author Marshall
 */
@WebFilter("/*")
public class LoginCheck implements Filter{

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest)sr;
        HttpServletResponse res=(HttpServletResponse)sr1;
        
        if(req.getServletPath().equals("/JavaPP/loginForm.jsp") || req.getServletPath().equals("/loginUser")){
            System.out.println("ok");
        }
        else{
            System.out.println("not ok");
//            System.out.println(req.getServletPath());
            
            HttpSession s=req.getSession();
            if(s.getAttribute("uname")==null){
                s.setAttribute("errorMsg", "You are not Logged in!!");
              System.out.println(s.getAttribute("errorMsg"));
//                req.getSession().setAttribute("errorMsg", "You are not loggrd in!!");
                res.sendRedirect("/ServletDemo3/JavaPP/loginForm.jsp");
                
//    response.sendRedirect("loginForm.jsp");
                return;
            }
            else{
               // s.getAttribute("uname");
            }
           
            
        }
         fc.doFilter(sr, sr1);
        
    }


}
