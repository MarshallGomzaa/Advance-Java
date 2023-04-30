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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Marshall
 */
public class getItemSelectBox extends HttpServlet {
    Connection con;
    

    @Override
    public void init() throws ServletException {
       try {
            con = DBConnect.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetAllItem.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
        String query = "select*from tbl_item";
        Statement stmt=con.createStatement();
        ResultSet result=stmt.executeQuery(query);

           String combo ="<select name='itemid'>";
           
           while(result.next()){
            String id=result.getString("id");
            String itemName=result.getString("name");
            combo+="<option value='"+id+"'>";
            combo+=itemName;
            combo+="</option>";
            

            
        }
        combo+="</select>";
        resp.setContentType("text/html");
        resp.getWriter().println(combo);
        
       
       // result.next();
        } catch (SQLException ex) {
            Logger.getLogger(GetAllItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void destroy() {
  try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SaveItemData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


