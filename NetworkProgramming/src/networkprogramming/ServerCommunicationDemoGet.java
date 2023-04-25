/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Marshall
 */
public class ServerCommunicationDemoGet {
    public static void main(String[]args) throws MalformedURLException, IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your email");
        String email=sc.nextLine();
        
        URL url=new URL("http://localhost/advjava/insert.php?name="+name+"&email="+email);
        URLConnection conn=url.openConnection();
        InputStream stream=conn.getInputStream();
        InputStreamReader r=new InputStreamReader(stream);
        
        int c;
        while((c=r.read())!=-1){
            System.out.print((char) c);
            
        }
        
               
    }
         
    
}
