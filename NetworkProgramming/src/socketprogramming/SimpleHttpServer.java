/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketprogramming;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/**
 *
 * @author Marshall
 */
public class SimpleHttpServer {
    public static void main(String[] args) throws IOException {
        int port =8080;
        //create a new HTTP server
        HttpServer server=HttpServer.create(new InetSocketAddress(port),0);
        
        //Create a new handler for the root path
        server.createContext("/", new HttpHandler(){
            public void handle(HttpExchange exchange) throws IOException{
                String response = "Hello, World!";
                exchange.sendResponseHeaders(200,response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });
        //start the server
        server.start();
        System.err.println("Server is started on port" +port);
    }
    
}





