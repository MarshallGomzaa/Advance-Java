/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 *
 * @author Marshall
 */
public class Ipnet {
    // InetAddress ip= InetAddress.getByName("192.168.1.1");
//           InetAddress ip2 = InetAddress.getByName("www.google.com");
//           System.out.println(ip2.getHostName());
//           System.out.println(ip2.getHostAddress());
//           System.out.println(ip.getHostName());
//           System.out.println(ip.getHostName());
//           //getbyAddress
//           byte[] add = {(byte)192, (byte)168,1,1};
//           InetAddress ip3 = InetAddress.getByAddress(add);
//           InetAddress ip4 = InetAddress.getByAddress("www.google.com",add);
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic 
        try{
InetAddress ip = InetAddress.getByName("192.168.1.1");
InetAddress ip2 = InetAddress.getByName("www.google.com");
            System.out.println(ip.getHostAddress());
            System.out.println(ip.getHostName());
            System.out.println(ip2.getHostName());
           System.out.println(ip2.getHostAddress());

           byte[] add = {(byte)192, (byte)168,1,1};
            InetAddress ip3 = InetAddress.getByAddress(add);
            InetAddress ip4 = InetAddress.getByAddress("www.google.com", add);
            System.out.println(ip.getHostName());
            System.out.println(ip2.getHostAddress());
            System.out.println(InetAddress.getLocalHost());
            System.out.println(InetAddress.getLoopbackAddress());

            InetAddress m1 = InetAddress.getByName("239.0.2.4");
            System.out.println(m1.isMulticastAddress());
            InetAddress m2 = InetAddress.getByName("190.0.0.0");
            System.out.println(m1.isAnyLocalAddress());
            InetAddress m3 = InetAddress.getByName("127.0.0.1");
            InetAddress m4 = InetAddress.getByName("::1");
            System.out.println(m3.isLoopbackAddress());
            System.out.println(m4.isLoopbackAddress());

        InetAddress s1 = InetAddress.getByName("FF0E:0000:0000:0000:0000:0000:0000:0000");
        System.out.println(s1.isMCGlobal());

        InetAddress myip2 = InetAddress.getByName("www.google.com");
            System.out.println("time" + myip2.isReachable(4000));

         InetAddress ipv4 = (InetAddress) InetAddress.getByName("192.178.1.1");
         InetAddress ipv6 = (InetAddress) InetAddress.getByName("FFE0:1101::");


    }
    catch(UnknownHostException ex){
            System.out.println(ex.getMessage());

    }
     catch(IOException ex){

         System.out.println(ex.getMessage());
     }

}
}




//multicast address = 224.0.0.0 - 239.255.255.255
//isMCLinkLocal() begin with FF02 
//isMCNodeLocal FF01 or FF11
    
