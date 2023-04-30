/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filetransfer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;

/**
 *
 * @author Marshall
 */
public class Server {
    public static DataInputStream dataInputStream=null;
    
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(3355);
        System.out.println("Server is waiting");
        try(Socket sc=ss.accept()) {
            System.out.println("Connected");
            dataInputStream=new DataInputStream(sc.getInputStream());
            recieveFile("C:\\Users\\Marshall\\Desktop\\new");
            dataInputStream.close();
            
            
            
        } catch (Exception e) {
            System.out.println("Server:"+e.getMessage());
        }
        

    }
    public static void recieveFile(String path) throws FileNotFoundException, IOException {
        int bytes=0;
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        long size=dataInputStream.readLong();
        byte[] buffer=new byte[4*1024];
        while(size>0 && (bytes = dataInputStream.read(buffer,0,(int)Math.min(buffer.length,size)))!=-1){
           fileOutputStream.write(buffer,0,bytes);
           size -= bytes;
        }
        fileOutputStream.close();
        
        
        
    }
}
