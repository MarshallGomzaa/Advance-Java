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
public class URLConnectionConfigureDemo {
    public static void main(String[]args) throws MalformedURLException, IOException{
        URL url=new URL("https://www.facebook.com");
        
        URLConnection conn=url.openConnection();
        System.out.println(conn.getURL());
        
        conn.setDoInput(true);
        System.out.println(conn.getDoInput());
        
        conn.setDoOutput(false);
        System.out.println(conn.getDoOutput());
        
        conn.setAllowUserInteraction(false);
        
        conn.setUseCaches(true);
        conn.setUseCaches(false);
        
        InputStream stream=conn.getInputStream();
        System.out.println(conn.getInputStream());//true
        
       Date d=new Date();
      // System.out.println(conn.getDoOutput());
       // conn.setIfModifiedSince(50000);//jan 1st 1970
        System.out.println(conn.getIfModifiedSince());
        
        conn.setReadTimeout(0);
         
        
        
        
    }
    
}
