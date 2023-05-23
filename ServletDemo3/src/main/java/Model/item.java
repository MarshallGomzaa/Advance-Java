/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import backend.DBConnect;
import com.mysql.cj.xdevapi.DbDoc;
import java.io.Serializable;
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
public class item  implements Serializable{
    Connection con;
    int id,price,stock;
    String name,photo;
    //manually
//    public int getId(){
//        return this.id;
//    }
//    public int getPrice(){
//        return this.price;
//    }

    public item() {
        try {
            con=DBConnect.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(item.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public void saveItem() throws ClassNotFoundException, SQLException{
        con=DBConnect.connect();
        String query="INSERT INTO `tbl_item`(`name`, `price`, `stock`, `photo`) VALUES (?,?,?,?)";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setString(1, this.name);
        stmt.setInt(2, this.price);
        stmt.setInt(3, this.stock);
        stmt.setString(4, this.photo);
        stmt.execute();
        
    }
    public String displayItem() throws ClassNotFoundException, SQLException{
        String query="SELECT * FROM `tbl_item`";
        PreparedStatement stmt=con.prepareStatement(query);
        ResultSet result=stmt.executeQuery(query);
        String table="<table border='1'>";
            table+="<tr>";
            table+="<th>Id<th>Name<th>Price<th>Stock";
            table+="</tr>";
        while(result.next()){
            String id=result.getString("id");
            table+="<tr>";
            table+="<td>"+result.getString("id")+"</td>";
            table+="<td>"+result.getString("name")+"</td>";
            table+="<td>"+result.getString("price")+"</td>";
            table+="<td>"+result.getString("stock")+"</td>";
            table+="</tr>";
            
        }
        
        table+="</table>";
        return table;
    }
    public void deleteItem() throws ClassNotFoundException, SQLException{
        String query="DELETE FROM `tbl_item` WHERE id=?";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setString(1, this.name);
        stmt.setInt(2, this.price);
        stmt.setInt(3, this.stock);
        stmt.setString(4, this.photo);
        stmt.execute();
    }
    public void updateItem() throws ClassNotFoundException, SQLException{
        String query="UPDATE `tbl_item` SET `name`=?,`price`=?WHERE id=?";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setString(1, this.name);
        stmt.setInt(2, this.price);
        stmt.setInt(3, this.stock);
        stmt.setString(4, this.photo);
        stmt.execute();
        
    }  
    public void getOneItem() throws SQLException{
        String query= "select * from tbl_item where id = ?";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setInt(1, this.id);
        ResultSet result = stmt.executeQuery();
        result.next();
        this.name=result.getString("name");
        this.photo=result.getString("photo");
        this.stock=result.getInt("stock");
        this.price=result.getInt("price");
                
    
        
    }
}
