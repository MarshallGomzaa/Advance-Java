/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filetransfer;

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
public class FactorialServer {
    public static void main(String[] args) throws IOException {
         ServerSocket serverSocket=new ServerSocket(3452);
        
        System.out.println("Socket is started and waiting for request");
        Socket sc=serverSocket.accept();
        BufferedReader reader=new BufferedReader(new InputStreamReader(sc.getInputStream()));
      //  String msg=reader.readLine();
        PrintWriter stream=new PrintWriter(sc.getOutputStream(),true);
      int fact=Integer.parseInt(reader.readLine());
      int number=Integer.parseInt(reader.readLine());
      int i;
       for(i=1;i<=number;i++){    
      fact=fact*i;    
        }    
       System.out.println("Factorial of "+number+" is: "+fact);    
      stream.flush();
      sc.close();
      serverSocket.close();
    
}
}
