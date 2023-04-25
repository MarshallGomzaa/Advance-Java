/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
//import static javax.swing.text.html.FormSubmitEvent.MethodType.POST;

/**
 *
 * @author Marshall
 */
public class HttpRequestDemo {
    public static void main(String[]args) throws IOException{
        URL url=new URL("http://localhost/advjava/addrecord.php");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your email");
        String email=sc.nextLine();
        System.out.println("Enter your address");
        String address=sc.nextLine();
        String q="name="+name+"&email="+email+"&address="+address;
        byte[] postData=q.getBytes(StandardCharsets.UTF_8);
        //proxy
        SocketAddress ip = new InetSocketAddress("192.167.10.10",80);
        Proxy p = new Proxy(Proxy.Type.HTTP, ip);
        //establlish tne connectiion using HttpURLConnetion,then set the do out stream
        HttpURLConnection conn=(HttpURLConnection)url.openConnection(p);
        
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        
        //to enable the streaming mode -->if your data is big size
        conn.setFixedLengthStreamingMode(4000);

        //write the byte data using the output stream
        OutputStream stream = conn.getOutputStream();
        stream.write(postData);
        InputStream in_stream = conn.getInputStream();
        InputStreamReader r=new InputStreamReader(in_stream);
        int c;
        while((c=r.read())!=-1){
            System.out.println((char)c);
        }
    }
    
}
