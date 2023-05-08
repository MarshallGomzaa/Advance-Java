/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package backend;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Marshall
 */
@WebServlet("/image")
public class ViewItem extends HttpServlet {
Connection con;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
             
        // Get the ID of the image from the request parameters
        int id = Integer.parseInt(req.getParameter("id"));
        Part part=req.getPart("photo");
        String filename=part.getSubmittedFileName();
        System.out.println(filename);
            
        // Get the session
        HttpSession s = req.getSession();
        // Retrieve the image data from the database
        String query="SELECT photo FROM tbl_item WHERE id = ?";
        Statement stmt=con.createStatement();
        ResultSet result=stmt.executeQuery(query);

           String image ="<select name='id'>";
           
           while(result.next()){
            String photo=result.getString("photo");
            image+="<option value='"+id+"'>";
            image+="</option>";  
        }
        image+="</select>";
        resp.setContentType("text/html");
        resp.getWriter().println(image);
        
            
        } catch (Exception e) {
             Logger.getLogger(GetAllItem.class.getName()).log(Level.SEVERE, null, e);
      
        }
        
  }
    
}