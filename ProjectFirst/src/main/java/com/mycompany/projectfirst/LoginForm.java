/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectfirst;

/**
 *
 * @author Marshall
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginForm {
    Container container;
    public LoginForm(){
        JFrame frame=new JFrame();
        container=frame.getContentPane();
        container.setLayout(null);
        Font font=new Font("Arial",Font.PLAIN,20);
        
        
        JLabel name=new JLabel("Username");
        name.setFont(font);
        JTextField Name=new JTextField();
        
        JLabel password=new JLabel("Password");
        password.setFont(font);
        JTextField Password=new JTextField();
        JButton Submit=new JButton("Submit");
        Submit.setFont(font);
        name.setBounds(10, 50, 100, 20);
        Name.setBounds(110, 50, 100, 20);
        password.setBounds(10, 70, 100, 20);
        Password.setBounds(110, 70, 100, 20);
        Submit.setBounds(30,300 , 101, 30);
        container.add(name);
        container.add(Name);
        container.add(password);
        container.add(Password);
        container.add(Submit);
        frame.setTitle("Login Form");
        frame.setSize(500, 500);
        frame.setBackground(Color.BLUE);
        frame.setVisible(true);
        Submit.addActionListener(new ActionListener(){
        
    @Override
    public void actionPerformed(ActionEvent e){
        int result=JOptionPane.showConfirmDialog(frame,"are you sure to display");
        if(result==0){
            System.out.println("yes Submitted");
            JOptionPane.showMessageDialog(frame,"yes submitted");
    
    }}});
    }
    public static void  main(String[]args){
        new LoginForm();
    }
        
        
        

        
        
        
                
    
}
