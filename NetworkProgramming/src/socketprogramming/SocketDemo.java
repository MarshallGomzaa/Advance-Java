/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketprogramming;

import java.net.Socket;
import java.net.SocketAddress;

/**
 *
 * @author Marshall
 */
public class SocketDemo {
    public static void main(String[] args) {
        try {
//            Socket sc= new Socket();  // empty socket 
//            //SocketAddress class(server address represent)
//            SocketAddress add=new InetSocketAddress("s1.yahoo.com",1233);
//            sc.connect(add); //connection request sent
//            sc.close();
//            
            //getting information about the socket 
            Socket sc2=new Socket("localhost",3452);
            SocketAddress scAdd=sc2.getRemoteSocketAddress();
            sc2.close();
            System.out.println(scAdd);
            
            //new Socket
            Socket sc3= new Socket();
            sc3.connect(scAdd); //reconnect with new socket
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
    
}
