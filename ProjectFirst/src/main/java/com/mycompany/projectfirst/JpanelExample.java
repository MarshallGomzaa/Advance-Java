/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectfirst;

import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.RED;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

/**
 *
 * @author Marshall
 */
public class JpanelExample extends JFrame{
    Container container;
    
    public JpanelExample(){
        container=this.getContentPane();
        container.setLayout(null);
        this.setBounds(100,100,600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
       
        JPanel red=new JPanel();
        red.setBackground(Color.red);
        red.setLayout(null);
        red.setBounds(0, 0, 600, 100);

        JPanel green=new JPanel();
        green.setBackground(Color.green);
        green.setLayout(null);
        green.setBounds(0, 100, 600, 100);
        
        JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[9];
        
        JButton button1=new JButton("Button1");
        JButton button2=new JButton("Button2");
        JButton button3=new JButton("Button3");
        JButton button4=new JButton("Button4");
        JButton button5=new JButton("Button5");
        JButton button6=new JButton("Button6");
        
        button5.setBounds(100,100,100,20);
        
        green.add(button1);
        green.add(button2);
        green.add(button3);
        
       container.add(red);
       container.add(green);
       
        JPanel gender=new JPanel();
       // Border border=BorderFactory.createLineBorder(BLACK,10);
        gender.setBounds(10,10,300,100);
        gender.setBackground(Color.red);
        gender.setLayout(new FlowLayout());
        
        JRadioButton male=new JRadioButton("Male");
       male.setBounds(10,30,100,40);
        JRadioButton female=new JRadioButton("Female");
        female.setBounds(110,30,100,40);
        
        container.add(gender);
        gender.add(male);
        gender.add(female);
        container.add(male);
        container.add(female);
        red.add(gender);

        
        
        
        
        
        this.setVisible(true);
        
        
                
        
    }
    public static void main(String[] args){
      new JpanelExample();
    }
    
    
}
