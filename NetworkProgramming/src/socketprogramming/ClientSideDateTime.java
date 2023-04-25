/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


/**
 *
 * @author Marshall
 */
public class ClientSideDateTime {
    public static void main(String[] args) {
       try {
			// Connect to the server on localhost and port 12345
			Socket socket = new Socket("192.168.0.101", 12345);
			
			// Read the date and time from the server
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String dateTime = in.readLine();
			
			// Display the date and time on the client machine
			System.out.println("The current date and time is: " + dateTime);
			
			// Close the input stream and socket
			in.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
      
    }
   
}
   
