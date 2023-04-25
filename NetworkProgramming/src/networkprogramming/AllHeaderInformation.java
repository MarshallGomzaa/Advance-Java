/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


/**
 *
 * @author Marshall
 */
public class AllHeaderInformation {
    public static void main(String[] args) throws MalformedURLException, IOException{
        URL url= new URL("https://www.google.com");
        URLConnection conn=url.openConnection();
        InputStream stream=conn.getInputStream();
        
        for(int i=0;;i++){
            String header=conn.getHeaderField(1);
            if(header==null){
                break;
                
            }
            System.out.println(header+conn.getHeaderFieldKey(i)+"=");
            
        }
    }
    
}
