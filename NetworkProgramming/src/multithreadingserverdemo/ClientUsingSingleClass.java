/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadingserverdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Marshall
 */
public class ClientUsingSingleClass {
    static BufferedReader bufferedReader=null;
    static String line;
    public static void main(String[] args) throws IOException {
        Socket sc=new Socket("192.168.0.112",4389);
        bufferedReader=new BufferedReader(new InputStreamReader(sc.getInputStream()));
        while((line=bufferedReader.readLine())!=null){
            System.out.println(line);
            
        }
        bufferedReader.close();
        sc.close();
        
        
    }
    
}
