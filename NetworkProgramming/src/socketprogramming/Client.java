/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Marshall
 */
public class Client {
    public static void main(String[] args) throws IOException {
        
        Socket sc= new Socket("192.168.0.121",12345);
        PrintWriter r= new PrintWriter(sc.getOutputStream());
        System.out.println("enter some message");
        Scanner s=new Scanner(System.in);
        PrintWriter p= new PrintWriter(sc.getOutputStream(),true);
//        r.write(s.nextLine());
//        r.flush();

//Sending two no to get sum
System.out.println("enter num1");
int n1=s.nextInt();
System.out.println("enter num2");
int n2=s.nextInt();
p.println(n1);
p.println(n2);
        BufferedReader rr=new BufferedReader(new InputStreamReader(sc.getInputStream()));
        System.out.println(rr.read());
        p.flush();
        sc.close();
        
        

    }
    
}
