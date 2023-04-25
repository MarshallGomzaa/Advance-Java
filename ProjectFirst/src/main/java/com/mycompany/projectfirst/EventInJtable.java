/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change frame license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit frame template
 */
package com.mycompany.projectfirst;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marshall
 */
public class EventInJtable extends JFrame implements ActionListener{
    Container container;
    JFrame frame=new JFrame();
    public EventInJtable(){
        container=frame.getContentPane();
        frame.setSize(800, 800);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Event in JTable");
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setResizable(false);
        
        
        JButton clickme=new JButton("Click Me");
         
    clickme.addActionListener(new ActionListener(){
        
    @Override
    public void actionPerformed(ActionEvent e){
        int result=JOptionPane.showConfirmDialog(frame,"are you sure to display");
        if(result==0){
            System.out.println("yes clicked");
            JOptionPane.showMessageDialog(frame,"yes clicked");
        }else if(result==JOptionPane.NO_OPTION){
           System.out.println("no clicked"); 
              JOptionPane.showMessageDialog(frame,"no clicked");
        }else if(result==JOptionPane.CANCEL_OPTION){
            System.out.println("Cancelled clicked"); 
               JOptionPane.showMessageDialog(frame,"camcelled clicked");
        }
    
    }
    });
    container.add(clickme);
    frame.setVisible(true);
  }
    public static void  main(String[]args){
        new EventInJtable();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }


}
