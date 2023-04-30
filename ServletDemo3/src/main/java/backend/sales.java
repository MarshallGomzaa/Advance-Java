/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package backend;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
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
public class sales extends HttpServlet {
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
           
       String itemid= req.getParameter("itemid");
       String price=req.getParameter("price");
       String quantity=req.getParameter("quantity");
       String query1="UPDATE `tbl_item` SET `stock`= (SELECT stock from tbl_item WHERE id= ?)-? WHERE id=?";
       String query="INSERT INTO `tbl_sales`( `item_id`, `quantity`, `price`) VALUES (?,?,?)";
       
            PreparedStatement obj=con.prepareStatement(query);
            
            obj.setString(1, itemid);
            obj.setString(2, quantity);
            obj.setString(3, price);
            
            obj.executeUpdate();
             PreparedStatement stmt=con.prepareStatement(query1);
            
            stmt.setString(1, itemid);
            stmt.setString(2, quantity);
            stmt.setString(3, itemid);
            
            stmt.executeUpdate();
            HttpSession s=req.getSession();
            s.setAttribute("successmsg", "Item successfully sold");
            res.sendRedirect("JavaPP/menu.jsp");
            res.getWriter().println("Item successfully sold");
            
        } catch (SQLException ex) {
            res.getWriter().println(ex.getMessage());
            Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
