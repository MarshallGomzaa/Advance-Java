/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketprogramming;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


/**
 *
 * @author Marshall
 */
//program for date time service using socket
public class DateTimeSocket {
    public static void main(String[] args) {
         try {
			// Create a new ServerSocket object
			ServerSocket serverSocket = new ServerSocket(12345);
			
			// Continuously listen for client connections
			while (true) {
				System.out.println("Waiting for client connection...");
				
				// Accept the client connection and create a new socket object
				Socket clientSocket = serverSocket.accept();
				
				// Get the current date and time
				Date date = new Date();
				String dateTime = date.toString();
				
				// Send the date and time to the client
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
				out.println(dateTime);
				
				// Close the socket and output stream
				out.close();
				clientSocket.close();
				
				System.out.println("Sent date and time to client");
			}
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
    }
   
}