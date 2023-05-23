/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Marshall
 */
public class purchase {
    Connection con;
    int id,itemid,quantity,price;
    String name,photo;
    public void purchaseItem() throws SQLException{
        String query="UPDATE `tbl_item` SET `stock`= ? +(SELECT stock from tbl_item WHERE id= ?)WHERE id=?";
       String query1="INSERT INTO `tbl_purchase`( `item_id`, `quantity`, `price`) VALUES (?,?,?)";
        String query2 = "select*from tbl_item";
        PreparedStatement stmt=con.prepareStatement(query);
        
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
        
    }
}
