/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Marshall
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(3452);
        
        System.out.println("Socket is started and waiting for request");
        Socket sc=serverSocket.accept();
        BufferedReader reader=new BufferedReader(new InputStreamReader(sc.getInputStream()));
      //  String msg=reader.readLine();
        PrintWriter stream=new PrintWriter(sc.getOutputStream(),true);
      int n1=Integer.parseInt(reader.readLine());
      int n2=Integer.parseInt(reader.readLine());
      stream.println("sum="+(n1+n2));
      stream.flush();
      sc.close();
      serverSocket.close();
    
      
        
        //System.out.println(msg);
        
        
        
    }
    
}
