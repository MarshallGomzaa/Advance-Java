/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
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
public class ActivateUser extends HttpServlet {
Connection con;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try {
        PreparedWay(req, resp);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ActivateUser.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public void PreparedWay(HttpServletRequest req, HttpServletResponse res) throws IOException, ClassNotFoundException{
         try {
           con=DBConnect.connect();
       int id= Integer.parseInt(req.getParameter("id"));
       String query="UPDATE `tbl_user` SET `status`=? WHERE id=?";
       
            PreparedStatement obj=con.prepareStatement(query);
            
            obj.setString(1, "activate");
            obj.setInt(2, id);
            
            
            obj.executeUpdate();
            
            res.getWriter().println("Activated");
            con.close();
        } catch (SQLException ex) {
            res.getWriter().println(ex.getMessage());
            Logger.getLogger(saveUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
