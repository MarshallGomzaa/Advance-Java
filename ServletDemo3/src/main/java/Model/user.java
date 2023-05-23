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
public class user {
    Connection con;
    int id;
    String username,password,status;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void saveUser() throws SQLException{
        String query="INSERT INTO `tbl_user`(`id`, `username`, `password`, `status`) VALUES (?,?,?,?)";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setString(1, this.username);
        stmt.setString(2, this.password);
        stmt.setString(3, this.status);
        stmt.execute();
    }
    public String displayUser() throws SQLException{
        String query="select*from tbl_user";
         PreparedStatement stmt=con.prepareStatement(query);
         ResultSet result=stmt.executeQuery(query);
        String table="<table border='1'>";
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
        return table;
    }
    public void deleteUser() throws ClassNotFoundException, SQLException{
        String query="DELETE FROM `tbl_user` WHERE id=?";
         PreparedStatement stmt=con.prepareStatement(query);
        stmt.setString(1, this.username);
        stmt.setString(2, this.password);
        stmt.setString(3, this.status);
        stmt.execute();
        
    }
    public void getOneUser() throws SQLException{
        String query= "select * from tbl_user where id = ?";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setString(1, this.username);
        stmt.setString(2, this.password);
        stmt.setString(3, this.status);
        stmt.execute();
        
    }
}
