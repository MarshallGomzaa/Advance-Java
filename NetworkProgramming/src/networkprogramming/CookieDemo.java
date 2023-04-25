/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

/**
 *
 * @author Marshall
 */
public class CookieDemo {
         public static void main(String[]args) throws MalformedURLException, IOException{
             CookieManager manager=new CookieManager();
             manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
             CookieManager manager2=new CookieManager();
             manager2.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
             
             CookieHandler.setDefault(manager);
             
             
             URL url=new URL("https://www.youtube.com");
             URLConnection conn=url.openConnection();
             conn.getContent();
             URL url2=new URL("https://www.google.com");
             URLConnection conn2=url.openConnection();
             conn2.getContent();
             
             
             CookieStore cookieStore=manager.getCookieStore();
             List<HttpCookie>cookies=cookieStore.getCookies();
             
             for(HttpCookie c:cookies){
                 System.out.println("Domain"+c.getDomain());
                 System.out.println("Max age"+c.getMaxAge());
                 System.out.println("Name of cooki"+c.getName());
                 System.out.println("Value of cookie"+c.getValue());
                 System.out.println("Version"+c.getVersion());
             }
             
         }
    
}
