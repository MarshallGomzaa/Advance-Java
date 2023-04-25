/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectfirst;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Marshall
 */
public class GraphicsExample extends JFrame{
    Container container;
    public GraphicsExample(){
        container=this.getContentPane();
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(800, 750);
                //this.setBounds(600, 500, 700, 600);
	//this.setLayout(null);
        mypanel panel=new mypanel();
        container.add(panel);
        this.setVisible(true);       
		
    }
    

class mypanel extends JPanel{
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawRect(10, 10,100,50);
        
        g.setColor(Color.red);
       g.fillRect(300, 100,100,50);
       
        g.setColor(Color.black);
        g.fillOval(200, 10, 50, 50);
        
        g.setColor(Color.orange);
        g.draw3DRect(100, 300, 100, 100, rootPaneCheckingEnabled);
        
       // ImageIcon icon=new ImageIcon();
       //g.drawImage(img, WIDTH, WIDTH, this)
        
    }

    
}
    public static void main(String[]args){
        new GraphicsExample().setVisible(true);
        
        
    }
}
