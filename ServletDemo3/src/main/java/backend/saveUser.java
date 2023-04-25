/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marshall
 */
public class saveUser extends HttpServlet{
    Connection con;

    @Override
    public void init() throws ServletException {
        try {
            con=DBConnect.connect();
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(saveUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PreparedWay(req, resp);
        

       
    }
    public void PreparedWay(HttpServletRequest req, HttpServletResponse res) throws IOException{
         try {
           
       String username= req.getParameter("username");
       String password=req.getParameter("password");
       String query="INSERT INTO `tbl_user`( `username`, `password`, `status`) VALUES (?,?,?)";
       
            PreparedStatement obj=con.prepareStatement(query);
            
            obj.setString(2, password);
            obj.setString(1, username);
            obj.setString(3, "pending");
            
            obj.executeUpdate();
            
            res.getWriter().println("user inserted successfully");
            con.close();
        } catch (SQLException ex) {
            res.getWriter().println(ex.getMessage());
            Logger.getLogger(saveUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
           
        
    
    
}
