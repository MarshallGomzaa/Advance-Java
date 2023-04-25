/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;
import java.util.Scanner;
import java.net.MalformedURLException;
/**
 *
 * @author Marshall
 */
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;


public class URLEncodeDemo {
    public static void main(String[]args) throws MalformedURLException{
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your query");
        String q=sc.nextLine();
        String url="https://www.google.com?q=";
        System.out.println("Original url\n+url+q");
        String encodedUrl=URLEncoder.encode(url+q);//blind encoding
        String eq=URLEncoder.encode(url+q);
        System.out.println(url+eq);
        
        String url2="https://www.abc.com?name=ram=ram&city=ktm&q=what is network programming ?";
        
        
        URL u=new URL(url2);
        String o;
        o=u.getProtocol()+"://";
        o+=u.getAuthority()+"?";
        
        o+="name="+URLEncoder.encode("ram")+"&";
        o+="city="+URLEncoder.encode("ktm"+"&");
        o+="q="+URLEncoder.encode("What is network programming?");
        System.out.println(o);
        
        
        System.out.println(URLDecoder.decode(o));
        System.out.println(URLDecoder.decode("https://www.google.com?q="));
        
        
        
        
        
        
        
      
                
        
        
    }
}
