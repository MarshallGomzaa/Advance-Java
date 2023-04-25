/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectfirst;

import java.awt.*;
import java.awt.event.MouseEvent;
//import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author Marshall
 */
public class SwingPractice extends JFrame {
    Container container;
    public SwingPractice(){
        
        this.setSize(600,600);
        container=this.getContentPane();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        JLabel pan=new JLabel("Click Here");
        pan.addMouseListener(new myListener());
        pan.setBounds(10, 10, 100, 25);
        this.addWindowListener((WindowListener) new mywindow());
        container.add(pan);
        
        
        
        
        
    }
    public static void main(String[]args){
        new SwingPractice();
        
    }
}
class myListener implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked!!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("MousePressed");
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    
}
class mywindow extends WindowAdapter{
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened");
       
    }
    @Override
    public void windowClosed(WindowEvent e){
        System.out.println("Window Closed");
    }
    
}
