/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package backend;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 *
 * @author Marshall
 */
@WebServlet(name = "loginUser", urlPatterns = {"/loginUser"})
public class loginUser extends HttpServlet {
     Connection con;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    try {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        String status = "activate";
        con = DBConnect.connect();
        String query = "SELECT * FROM `tbl_user` WHERE username = ? AND password=? AND status = ? ";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, username);
        stmt.setString(2, password);
        stmt.setString(3, status);
        ResultSet result = stmt.executeQuery();
        HttpSession s=req.getSession();
        if(result.next()){
            
            if(req.getParameter("remUser")!=null){
                System.out.println("checked");
                Cookie c=new Cookie("username", username);
                Cookie c1=new Cookie("password", password);
                
                res.addCookie(c1);
                res.addCookie(c);
                
            }else{
                Cookie c[]=req.getCookies();
                for(Cookie co:c){
                    if(co.getName().equals("username")){
                       co.setMaxAge(0);
                        res.addCookie(co);
                    }
                    if(co.getName().equals("password")){
                        co.setMaxAge(0);
                        res.addCookie(co);
                    }
                }
            }
            
            s.setAttribute("uid", result.getString("id"));
            s.setAttribute("uname", username);
            res.sendRedirect("JavaPP/menu.jsp");
            
            
        }else{
            s.setAttribute("errorMsg","Invalid Username or Password");
            res.sendRedirect("JavaPP/loginForm.jsp");
        }
        
        
    } catch (ClassNotFoundException | SQLException ex) {
        res.getWriter().println("wrong user password");
        Logger.getLogger(loginUser.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}
