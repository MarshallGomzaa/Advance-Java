/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.http.HttpServlet;

/**
 *
 * @author Marshall
 */
public class GetAllUsers extends HttpServlet {
     Connection con;
    

    @Override
    public void init() throws jakarta.servlet.ServletException {
       try {
            con = DBConnect.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetAllItem.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    protected void doPost(jakarta.servlet.http.HttpServletRequest req, jakarta.servlet.http.HttpServletResponse resp) throws jakarta.servlet.ServletException, IOException {
        try {
        String query = "select*from tbl_user";
        Statement stmt=con.createStatement();
        ResultSet result=stmt.executeQuery(query);
        String table="<table>";
            table+="<tr>";
            table+="<th>Id<th>Username<th>Status";
            table+="</tr>";
        while(result.next()){
            String id=result.getString("id");
            table+="<tr>";
            table+="<td>"+result.getString("id")+"</td>";
            table+="<td>"+result.getString("username")+"</td>";
            table+="<td>"+result.getString("password")+"</td>";
            table+="<td>"+result.getString("status")+"</td>";
            table+="<td><a onclick='return confirm(\"Are you sure you want to delete?\")'href ='../SuspendUser?id="+id+"'>Suspend</a></td>";
            table+="<td><a onclick='return confirm(\"Are you sure you want to delete?\")'href ='../ActivateUser?id="+id+"'>Activated</a></td>";
            table+="</tr>";
            
        }
        table+="</table>";
        resp.setContentType("text/html");
        resp.getWriter().println(table);
        
       
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
