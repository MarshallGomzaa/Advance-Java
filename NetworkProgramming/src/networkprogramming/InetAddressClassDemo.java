/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 *
 * @author Marshall
 */
public class InetAddressClassDemo {
    public static void main(String[]atrgs){
        try{
            //getByName
            InetAddress ip=InetAddress.getByName("192.168.1.1");
            InetAddress ip2=InetAddress.getByName("www.google.com");
            //getByAddress
            byte[] add={(byte)192,(byte)168,1,};
            InetAddress ip3=InetAddress.getByAddress(add);
            InetAddress ip4=InetAddress.getByAddress("www.google.com", add);
            
    System.out.println(ip.getHostName());
    System.out.println(ip2.getHostAddress());
    
    System.out.println(InetAddress.getLocalHost());
    System.out.println(InetAddress.getLoopbackAddress());
    
    InetAddress m1=InetAddress.getByName("293.0.0.0");
    System.out.println(m1.isMulticastAddress());
        InetAddress m2=InetAddress.getByName("190.0.0.0");
    System.out.println(m2.isAnyLocalAddress());
    
            InetAddress m3=InetAddress.getByName("127.0.0.1");
    System.out.println(m3.isAnyLocalAddress());
    
            InetAddress m4=InetAddress.getByName("::1");
    System.out.println(m4.isAnyLocalAddress());
    System.out.println(m3.isLoopbackAddress());
    System.out.println(m4.isLoopbackAddress());
    
    InetAddress s1=InetAddress.getByName("FFE:0000:0000:0000:0000");
    System.out.println(s1.isMCGlobal());
    
        //Reachability check
    InetAddress myip2=InetAddress.getByName("142.250.183.4");
    System.out.println("time:"+myip2.isReachable(400));
    
    Inet4Address ipv4=(Inet4Address)Inet4Address.getByName("192.178.1.1");
    Inet6Address ipv6=(Inet6Address)Inet6Address.getByName("FFE0:1101::");
    
    
    
        }
        catch(UnknownHostException ex){
            System.out.println(ex.getMessage());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
