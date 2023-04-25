/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marshall
 */
public class updateItem extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id=Integer.parseInt(req.getParameter("id"));
            String itemName=req.getParameter("itemName");
            int price=Integer.parseInt(req.getParameter("price"));
            
            
            
            Connection con=DBConnect.connect();
            String q="UPDATE `tbl_item` SET `name`=?,`price`=?WHERE id=?";
            
            PreparedStatement s=con.prepareStatement(q);
            s.setString(1, itemName);
            s.setInt(2, price);
            s.setInt(3, id);
            s.executeUpdate();
            resp.getWriter().println("updated");
            
        } catch (ClassNotFoundException e) {
            resp.getWriter().println(e.getMessage());
            Logger.getLogger(updateItem.class.getName()).log(Level.SEVERE, null, e);
            
        } catch (SQLException ex) {
            resp.getWriter().println(ex.getMessage());
            Logger.getLogger(updateItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
}
