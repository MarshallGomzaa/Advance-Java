/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filetransfer;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

/**
 *
 * @author Marshall
 */
public class Client {
    public static DataOutputStream dataOutputStream=null;
    public static void main(String[] args) {
        try(Socket sc=new Socket("192.168.0.121",3355)) {
            dataOutputStream=new DataOutputStream(sc.getOutputStream());
            //send file
            sendfile("D:\\New folder\\DSunit7.pdf");
            dataOutputStream.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void sendfile(String file) throws IOException{
        int bytes=0;
        File f=new File(file);
        FileInputStream fileInputStream=new FileInputStream(file);
        dataOutputStream.writeLong(f.length());
        byte[] buffer=new byte[4*1024];
        while ((bytes=fileInputStream.read(buffer))!=-1) {
            dataOutputStream.write(buffer,0,bytes);
            dataOutputStream.flush();
            
        }
        
    }
}
