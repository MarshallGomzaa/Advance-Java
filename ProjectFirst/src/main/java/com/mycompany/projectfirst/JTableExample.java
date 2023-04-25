/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectfirst;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Marshall
 */


public class JTableExample extends JFrame{
    Container container;
    public JTableExample(){       
        
        container=this.getContentPane();
       
        //this.setSize(400,400);
        this.setBounds(100,100,600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        String data[][]={
            {"Manb","Ktm","29"},
            {"Manish","Ktm","15"},
            {"Ram","Pkr","20"}
        };
        String colNames[]={"Name","Address","Age"};
        
        JTable table=new JTable(data,colNames);
        JScrollPane scroll=new JScrollPane(table);
        container.add(scroll);
        //container.add(table);
        this.setVisible(true);

        
    }

    
    public static void main(String[]args){
        new JTableExample();
    }


}

    
