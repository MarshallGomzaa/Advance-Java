/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectfirst;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Marshall
 */
public class NewLoginForm {
    Container container;
    JFrame frame=new JFrame();
 public NewLoginForm(){
     container=frame.getContentPane();
        JPanel panel=new JPanel(new GridLayout(2,2));
        panel.setSize(300,400);
       // Font font=new Font(Arial,Font.PLAIN,50);
        JLabel lbl_username=new JLabel("Username");
        lbl_username.setBounds(0, 0, 100, 25);
       // lbl_username.Font(font);
        JTextField username=new JTextField();
        frame.setTitle("Login Form");
        frame.setSize(500, 500);
        frame.setBackground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
       
       
        JLabel lbl_password=new JLabel("Password");
        lbl_password.setBounds(0, 30, 100, 25);
        JPasswordField password=new JPasswordField();
       
        
        panel.add(lbl_username);
        panel.add(username);
        panel.add(lbl_password);
        panel.add(password);
        
        container.add(panel);
        
       
    
     
     
 }
 public static void main(String[]args){
     new NewLoginForm();
     
 }

}
