/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 *
 * @author Marshall
 */
public class HttpHeaderConfidDemo {
    public static void main(String[]args) throws MalformedURLException, IOException{
          URL url=new URL("https://www.google.com");
          URLConnection conn=url.openConnection();
          
          Date d= new Date();
          conn.setRequestProperty("date", d.toString());
          System.out.println(conn.getRequestProperty("date"));
          conn.setRequestProperty("name", "xyz");
          conn.setRequestProperty("city", "ktm");
          //conn.connect();
          conn.addRequestProperty("date", "2023/10/12");
          System.out.println(conn.getRequestProperty("date"));
          InputStream stream=conn.getInputStream();
          //conn.setRequestProperty("pqr", "123");
          
          //to check security consideration in URLCOnnection class
          System.out.println(conn.getPermission());
          
    }
    
}
