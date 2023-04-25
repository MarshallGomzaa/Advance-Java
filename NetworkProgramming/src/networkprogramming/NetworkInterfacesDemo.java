/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
/**
 *
 * @author Marshall
 */

public class NetworkInterfacesDemo {
    public static void main(String[]args) throws SocketException,UnknownHostException{
        Enumeration<NetworkInterface> ips=
                NetworkInterface.getNetworkInterfaces();
        while(ips.hasMoreElements()){
            NetworkInterface ip=ips.nextElement();
            System.out.println(ip);
        }
       
        NetworkInterface e=NetworkInterface.getByName("eth0");
        InetAddress ip=InetAddress.getLocalHost();//return the local ipaddress
       // InetAddress myip=InetAddress.getByName("192.168.10.41");
        NetworkInterface m=NetworkInterface.getByInetAddress(ip);
        
         System.out.println(m.getDisplayName());
        
       
    }
    
}
