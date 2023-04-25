/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketprogramming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Marshall
 */
public class ClientMachine {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JPanel p=new JPanel();
        JLabel lbl=new JLabel("Client");
        JTextArea a = new JTextArea(20,30);
        JTextField mField=new JTextField(20);
        JButton btn= new JButton("Send");
        GroupLayout layout=new GroupLayout(p);
        layout.createSequentialGroup()
                .addComponent(lbl)
                .addComponent(a);
        a.disable();
        p.add(lbl);
        p.add(a);
        p.add(mField);
        p.add(btn);
        frame.add(p);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
               

        
        final Socket clientSocket;  //socket used by client to  send data from sserver
        final BufferedReader in;    //object to read data from socket
        final PrintWriter out;      //object to write into socket
       // final Scanner sc=new Scanner(System.in);
 
        try {
            clientSocket=new Socket("192.168.0.112",1203);
            System.out.println("Client is started \n");
            out=new PrintWriter(clientSocket.getOutputStream());
            in= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            
            btn.addActionListener(new ActionListener(){
            String msg;

            @Override
            public void actionPerformed(ActionEvent e) {
                msg=mField.getText();
                a.setText(a.getText()+"\nMe:"+msg);
                mField.setText("");
                out.println(msg);
                out.flush();
                
                
                
                
               
            }
            
        });

            Thread reciever= new Thread(new Runnable() {
                String msg;
                @Override
                public void run() {
                    try {
                        msg=in.readLine();
                        while(msg!=null){
                            System.out.println("Server:"+msg);
                            msg=in.readLine();
                        }
                        System.out.println("Server out of service");
                        out.close();
                        clientSocket.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    
                }
                
            });
            reciever.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    }
    
    

