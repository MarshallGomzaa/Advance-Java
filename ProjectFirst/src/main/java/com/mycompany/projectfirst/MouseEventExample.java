/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectfirst;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Marshall
 */
public class MouseEventExample extends JFrame {
    Container container;
    public MouseEventExample(){
        container=this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 550);
	this.setLayout(null);
        JLabel label=new JLabel("Click Me");
        label.addMouseListener(new myListener());
        label.setBounds(10,10,100,25);
        container.add(label);
        this.addWindowListener((WindowListener) new mywindow());
         this.setVisible(true);
        
    }
               public static void  main(String[]args){
                         new MouseEventExample();  
               }

        
    

}
/*
class myListener implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
         
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
    System.out.println("Mouse Exited");
    }

    
}*/


//Altrernate method
class myListener extends MouseAdapter{      

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Mouse Clicked");
    }
    
           public static void  main(String[]args){
        new myListener();
        
    

}
}
class mywindow implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
         System.out.println("windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated");

    }
    
               public static void  main(String[]args){
        new mywindow();
        
    

}
}