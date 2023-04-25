/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.IOException;
import java.net.*;
import java.util.*;
/**
 *
 * @author Marshall
 */
public class ProxySelectorDemo extends ProxySelector{
    public List<Proxy> select (URI uri){
        SocketAddress a = new InetSocketAddress("192.168.10.1",80);
        Proxy p1 = new Proxy(Proxy.Type.HTTP,a);

        SocketAddress a2 = new InetSocketAddress("192.168.10.2",80);
        Proxy p2 = new Proxy(Proxy.Type.HTTP,a2);

        SocketAddress a3 = new InetSocketAddress("192.168.10.3",80);
        Proxy p3 = new Proxy(Proxy.Type.HTTP,a3);

       List<Proxy> list = new ArrayList();
       list.add(p1);
       list.add(p2);
       list.add(p3);
       return list;

    }

    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
        throw new UnsupportedOperationException("Cannot connected with proxy server."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
