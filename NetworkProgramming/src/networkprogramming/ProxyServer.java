/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;

/**
 *
 * @author Marshall
 */
public class ProxyServer {
    public static void main(String[]args) throws MalformedURLException, IOException{
        String proxyAddress1="193.167.10.10";
                
        String proxyAddress="proxy1.asmt.edu.np";   //metghod 1(system property
        System.setProperty("http.proxyHost", proxyAddress);
        System.setProperty("http.proxyPort", "80");
        System.setProperty("http.nonProxyHosts", "www.google.com|www.facebook.com");
        
        URL url=new URL("http://www.xyz.com");
        url.openConnection();
        
        //method 2=proxy class
       String p1="192.168.1.0";
       String p2="192.168.1.1";
       
       SocketAddress a=new InetSocketAddress(p1,80);
       SocketAddress b=new InetSocketAddress(p2,80);
       
       
       
       
       //create the proxy
       
       Proxy pr1=new Proxy(Proxy.Type.HTTP,a);
       Proxy pr2=new Proxy(Proxy.Type.HTTP,b);
       
       URL u1=new URL("http://www.asmt.edu.np");
       URL u2=new URL("http://www.xyz.com");
       
       u1.openConnection(pr1);
       u2.openConnection(pr2);
       

        
    }
}
