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
import java.util.Scanner;

/**
 *
 * @author Marshall
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class ServerSideProgram{
    public static void main(String[] args) throws IOException
    {
        final ServerSocket serverSocket;
        final Socket clientSocket;
        final BufferedReader in;
        final PrintWriter out;
        final Scanner sc= new Scanner(System.in);
        
        serverSocket = new ServerSocket(1203);
        clientSocket= serverSocket.accept();
        System.out.println("server started");
        out= new PrintWriter(clientSocket.getOutputStream(),true);
        in= new  BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        
        Thread sender=new Thread(new Runnable(){
            String msg;
            @Override
            public void run() {
            while(true)
            {
                msg=sc.nextLine();
                out.println(msg);
                out.flush();
            }
            }
            
        });
        sender.start();
        
        Thread receive= new Thread(new Runnable()
        {
           String msg;
           
           @Override
           public void run()
           {
               try{
                   msg=in.readLine();
                   while(msg!=null)
                   {
                       System.out.println("Client:"+msg);
                       msg = in.readLine();
                   }
                   System.out.println("Client disconnect");
                   out.close();
                   clientSocket.close();
                   serverSocket.close();
               }catch(IOException e)
               {
                   e.printStackTrace();
               }
           }
        });
        receive.start();
    }
    
}