/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Marshall
 */
public class ClientSideProgram {
    public static void main(String[] args) {
        final Socket clientSocket;  //socket used by client to  send data from sserver
        final BufferedReader in;    //object to read data from socket
        final PrintWriter out;      //object to write into socket
        final Scanner sc=new Scanner(System.in);
        
        try {
            clientSocket=new Socket("192.168.0.107",1203);
            System.out.println("Client is started \n");
            out=new PrintWriter(clientSocket.getOutputStream());
            in= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            
            Thread sender= new Thread(new Runnable() {
                String msg;
                @Override
                public void run() {
                    while(true){
                        msg=sc.nextLine();
                        out.println(msg);
                        out.flush();
                    }
                    
                    
                }
            });
            sender.start();
            
            Thread reciever= new Thread(new Runnable() {
                String msg;
                @Override
                public void run() {
                    try {
                        msg=in.readLine();
                        while(msg!=null){
                            System.out.println("Server:"+msg);
                            msg=in.readLine();
                        }
                        System.out.println("Server out of service");
                        out.close();
                        clientSocket.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    
                }
                
            });
            reciever.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
