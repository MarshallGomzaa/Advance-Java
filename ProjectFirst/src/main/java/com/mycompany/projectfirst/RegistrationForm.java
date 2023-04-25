/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.projectfirst;

import java.awt.*;
import javax.swing.*;

public class RegistrationForm {

    public static void main(String args[]) {
        JFrame frame = new JFrame();
        JFrame frame1 = new JFrame();
        Container container = frame.getContentPane();
        Container container1= frame1.getContentPane();
        container.setLayout(null);
        container1.setLayout(null);
        Font font = new Font("Serif", Font.BOLD, 12);
        Font font1 = new Font("Serif", Font.BOLD, 25);

        JLabel Name = new JLabel("Name");
        Name.setFont(font);
        JTextField txtName = new JTextField();

        JLabel Mobile = new JLabel("Mobile");
        Mobile.setFont(font);
        JTextField txtMobile = new JTextField();
        JLabel reg=new JLabel("Registraion Form");
        reg.setFont(font1);

        JLabel Gender = new JLabel("Gender");
        Gender.setFont(font);
        JRadioButton male = new JRadioButton("Male");
        male.setFont(font);
        JLabel Term=new JLabel("Accept terms and conditions");
        Term.setFont(font);
        JCheckBox term = new JCheckBox();
        term.setFont(font);
        JLabel Address=new JLabel("Address");
        Address.setFont(font);
        JTextField address=new JTextField();
        JLabel DOB=new JLabel("DOB");
        DOB.setFont(font);
        
        
        JRadioButton female = new JRadioButton("Female");
        female.setFont(font);
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        String day[]=new String[31];
        String year[]=new String[100];
        String month[]={"jan","Feb","March","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for(int i=0;i<31;i++){
            day[i]=Integer.toString(i+1);
        }
        for(int i=0;i<100;i++){
            year[i]=Integer.toString(i+1970);
        }
        JLabel dayLabel = new JLabel("Day");
        dayLabel.setFont(font);
        JComboBox dayCombo = new JComboBox(day);
        
        JLabel monthLabel = new JLabel("Month");
        monthLabel.setFont(font);
        JComboBox monthCombo = new JComboBox(month);
        
        JLabel yearLabel = new JLabel("Year");
        yearLabel.setFont(font);
        JComboBox yearCombo = new JComboBox(year);
       

        JButton Submit = new JButton("Submit");
        Submit.setFont(font);
        JButton Reset = new JButton("Reset");
        Reset.setFont(font);

        //set Location
        Name.setBounds(15, 50, 150, 25);
        txtName.setBounds(200, 50, 300, 25);
        Mobile.setBounds(15, 100, 150, 25);
        txtMobile.setBounds(200, 100, 300, 25);
        Gender.setBounds(15, 200, 100, 25);
        male.setBounds(200, 200, 100, 25);
        female.setBounds(350, 200, 100, 25);
        dayCombo.setBounds(200, 300, 40, 25);
        monthCombo.setBounds(240, 300, 60, 25);
        yearCombo.setBounds(300, 300, 80, 25);
        term.setBounds(100, 500, 20, 20);
        Term.setBounds(140, 500, 200, 20);
        Address.setBounds(15,400,50,25);
        address.setBounds(100,400,200,80);
        reg.setBounds(200, 2, 300, 50);
        DOB.setBounds(15, 300, 100, 30);
        
        Submit.setBounds(50, 550, 100, 25);
        Reset.setBounds(200, 550, 150, 25);

        //adding component
        container.add(Name);
        container.add(txtName);
        container.add(Mobile);
        container.add(txtMobile);

        container.add(Gender);
        container.add(male);
        container.add(female);
        container.add(dayCombo);
        container.add(monthCombo);
        container.add(yearCombo);
        container.add(term);
        container.add(Term);
        container.add(Submit);
        container.add(Reset); 
        container.add(Address);
        container.add(address);
        container.add(reg);
        container.add(DOB);

        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Registration Form");
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}