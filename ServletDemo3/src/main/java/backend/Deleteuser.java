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
public class Deleteuser extends HttpServlet {
        Connection con;

    @Override
    public void init() throws ServletException {
        try {
            con = DBConnect.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Deleteuser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
       
        try {
            int id=Integer.parseInt(req.getParameter("id"));
            String query = "delete from tbl_user where id=?";
            PreparedStatement statement= con.prepareStatement(query);
            statement.setInt(1, id);
            
            statement.executeUpdate();
            
             resp.getWriter().println("data deleted successfully");
        } catch (SQLException ex) {
            resp.getWriter().println(ex.getMessage());
            Logger.getLogger(deleteItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    


}
