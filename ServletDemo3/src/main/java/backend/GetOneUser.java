/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package backend;

import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Marshall
 */
public class GetOneUser extends HttpServlet {
Connection con;
    @Override
    public void init() throws jakarta.servlet.ServletException {
        try {
            con = DBConnect.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetOneItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @Override
    protected void doGet(jakarta.servlet.http.HttpServletRequest req, jakarta.servlet.http.HttpServletResponse resp) throws jakarta.servlet.ServletException, IOException {
    try {
        int id = Integer.parseInt(req.getParameter("id"));
        String query= "select * from tbl_user where id = ?";
        
        PreparedStatement  stmt = con.prepareStatement(query);
        stmt.setInt(1,id);
        ResultSet result = stmt.executeQuery();
        result.next();
        
        HttpSession s = (HttpSession) req.getSession();
        s.setAttribute("id",result.getString("id"));
        s.setAttribute("itemName",result.getString("username"));
        s.setAttribute("price",result.getString("password"));
        
        resp.sendRedirect("JavaPP/updateuser.jsp");
    } catch (SQLException ex) {
        Logger.getLogger(GetOneItem.class.getName()).log(Level.SEVERE, null, ex);
    }
    
           
    }
}
