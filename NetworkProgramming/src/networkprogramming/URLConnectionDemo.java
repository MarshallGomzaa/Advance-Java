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
import java.net.UnknownHostException;


/**
 *
 * @author Marshall
 */
public class URLConnectionDemo {
    public static void main(String[] args) throws UnknownHostException, MalformedURLException, IOException{
    /*Scanner sc = new Scanner(System.in);
    System.out.println("Enter any two number:");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    URL url=new URL("http://localhost/serverdemo/add.php?num="+num1+"&num2="+num2);*/
    URL url1=new URL("https://www.onlinekhabar.com/");//+num1+"&num2="+num2);yo chai code read garnalaiii
    
    //connection open
    URLConnection conn=url1.openConnection();
    //read the data
    InputStream stream=conn.getInputStream();
    //now read the data from stream using INputStreamReader
    InputStreamReader r=new InputStreamReader(stream);
    //loop through each character
    
    int c;
    while((c=r.read())!=-1){
        System.out.print((char)c);
        
    }
    
    
    
    }
}
