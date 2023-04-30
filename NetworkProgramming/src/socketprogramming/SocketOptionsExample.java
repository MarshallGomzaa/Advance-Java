/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketprogramming;

import java.net.Socket;
import java.net.SocketException;

/**
 *
 * @author Marshall
 */
public class SocketOptionsExample {
    public static void main(String[] args) throws SocketException {
        Socket socket=new Socket();
        //TCP_nodelay
        socket.setTcpNoDelay(true);
        System.out.println("TCP_NODELAY" + socket.getTcpNoDelay());
        
        
    }
    
}
