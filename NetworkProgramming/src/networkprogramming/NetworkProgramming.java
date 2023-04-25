/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package networkprogramming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Marshall
 */
public class NetworkProgramming {

    /**
     * @param args the command line arguments
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        InetAddress ip = InetAddress.getByName("192.168.1.1");
        System.out.println(ip.getHostAddress());
        
        byte[] add= {(byte)142,(byte)250,(byte)183,(byte)4};
        // TODO code application logic here
    InetAddress ip2=InetAddress.getByAddress("www.google.com", add);
    System.out.println(ip.getHostName());
    System.out.println(ip.getHostAddress());
    
    InetAddress ip3 = InetAddress.getByAddress(add);
    System.out.println(ip3.getHostName());
    System.out.println(ip3.getHostAddress());
    
    InetAddress myip=InetAddress.getLocalHost();
    InetAddress loopback=InetAddress.getLoopbackAddress();
    
    System.out.println("my ip address=" +myip.getHostAddress());
    System.out.println("loopback ip address"+loopback.getHostAddress());
    
    
    //Reachability check
    InetAddress myip2=InetAddress.getByName("142.250.183.4");
    System.out.println(myip2.isReachable(4));
            
    }
}