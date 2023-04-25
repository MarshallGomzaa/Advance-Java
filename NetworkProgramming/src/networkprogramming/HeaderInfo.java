/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Date;

/**
 *
 * @author Marshall
 */
public class HeaderInfo {
     public static void main(String[] args) throws UnknownHostException, MalformedURLException, IOException{
         URL url= new URL("https://www.google.com");
         URLConnection conn=url.openConnection();
         InputStream stream=conn.getInputStream();
         //InputStreamReader r=new InputStreamReader(stream);
         
         
         
         //Method 1
         System.out.println(conn.getContentType());
         System.out.println(new Date(conn.getDate()));
         System.out.println(conn.getContentLength());
          System.out.println(conn.getExpiration());
           System.out.println(conn.getLastModified());
           
           //method 2
            System.out.println("---------Method 2------");
             System.out.println(conn.getHeaderField("content-type"));
              System.out.println(conn.getHeaderField("content-Length"));
               System.out.println(conn.getHeaderField("date"));
                System.out.println(conn.getHeaderField("last-modified"));
           
     }
}
