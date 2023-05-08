/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Marshall
 */


import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


@MultipartConfig
public class SaveItemData extends HttpServlet {
    Connection con;
    @Override
    public void init() throws ServletException {
    
        try {
            con = DBConnect.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveItemData.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
    }

   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //normalWay(req, res);
       PreparedWay(req, res);
    }
    
    public void PreparedWay(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        String itemName = req.getParameter("itemName");
        int price = Integer.parseInt(req.getParameter("price"));
        Part part=req.getPart("photo");
        String filename=part.getSubmittedFileName();
        System.err.println(filename);
        try {
            con = DBConnect.connect();
            String query = "INSERT INTO `tbl_item`(`name`, `price`, `stock`, `photo`) VALUES (?,?,?,?)";
            PreparedStatement stat  = con.prepareStatement(query);
            //binding parameter value
            stat.setString(1, itemName);
            stat.setInt(2, price);
            stat.setInt(3, 0);
            stat.setString(4, filename);
            
            //uploading photo
            InputStream is=part.getInputStream();
            byte data[]=new byte[is.available()];
            is.read(data);
            is.close();
//            String path="/JavaPP/uploads";
            String realPath=getServletConfig().getServletContext().getRealPath("/")+"JavaPP"+File.separator+"uploads"+File.separator+filename;
            System.out.println(realPath);
            FileOutputStream fileout=new FileOutputStream(realPath);
            fileout.write(data);
            fileout.close();
            
            stat.executeUpdate();
          
            res.getWriter().println("inserted succesfully");
                    
                    
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(itemName);
        System.out.println(price);
    }

    public void normalWay(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        String itemName = req.getParameter("itemName");
        int price = Integer.parseInt(req.getParameter("price"));
        Part part=req.getPart("photo");
        String filename=part.getSubmittedFileName();
//        String photo = req.getParameter("photo");

                

        try {
            Connection con = DBConnect.connect();
            String query = String.format("INSERT INTO `tbl_item`(`name`, `price`, `stock`, `photo`) VALUES ('%s', %d,0,'%s')",itemName,price);
            Statement stat  = con.createStatement();
            
            
            //uploading photo
            InputStream is=part.getInputStream();
            byte data[]=new byte[is.available()];
            is.read(data);
            is.close();
            
//            String path="/JavaPP/uploads";
            String realPath=getServletConfig().getServletContext().getRealPath("/")+"JavaPP"+File.separator+"uploads"+File.separator+filename;
            System.out.println(realPath);
            FileOutputStream fileout=new FileOutputStream(realPath);
            fileout.write(data);
            fileout.close();
            
            stat.executeUpdate(query);
            res.getWriter().println("inserted succesfully");
                    
                    
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(itemName);
        System.out.println(price);

        
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