/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package backend;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marshall
 */
public class ViewItem extends HttpServlet {
    Connection con;
        @Override
    public void init() throws ServletException {
        try {
            con = DBConnect.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetOneItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
             // set content type to image/png
    res.setContentType("image/png");
    // retrieve photo data from database
        int id = Integer.parseInt(req.getParameter("id"));
        String query= "select photo from tbl_item where id = ?";
    PreparedStatement stmt = con.prepareStatement(query);
    stmt.setInt(1, id); 
    ResultSet result = stmt.executeQuery();
    if (result.next()) {
        byte[] photo = result.getBytes("photo");
        
        // write the binary data to the response output stream
        ServletOutputStream out = res.getOutputStream();
        out.write(photo);
        out.flush();
        out.close();
    } else {
        // handle error if image is not found
        res.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
        } catch (Exception e) {
        }

    
    }
}
