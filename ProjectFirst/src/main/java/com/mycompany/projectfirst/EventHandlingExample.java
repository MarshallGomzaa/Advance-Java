/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectfirst;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @aAuthor Marshall
 */
public class EventHandlingExample extends JFrame implements ActionListener{
    public JTextField txtName;
    public JTextField container;
    public EventHandlingExample(){
        Container container = this.getContentPane();
        container.setLayout(null);
        Font font = new Font("Serif", Font.BOLD, 12);

        JLabel firstname = new JLabel("FirstName");
        firstname.setFont(font);
         txtName = new JTextField();

        JLabel lastname = new JLabel("LastName");
        lastname.setFont(font);
        JTextField txtlastname = new JTextField();

        JLabel password = new JLabel("Password");
        password.setFont(font);
        JPasswordField txtpassword = new JPasswordField();

        JLabel Gender = new JLabel("Gender");

        Gender.setFont(font);

        JRadioButton male = new JRadioButton("Male");
        male.setFont(font);
        JRadioButton female = new JRadioButton("female");
        female.setFont(font);
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        JLabel hobby = new JLabel("Hobby");
        hobby.setFont(font);
        JCheckBox singing = new JCheckBox("Singing");
        singing.setFont(font);

        JCheckBox dancing = new JCheckBox("Dancing");
        dancing.setFont(font);
        JCheckBox reading = new JCheckBox("Reading");
        reading.setFont(font);

        String countryNames[] = {"Nepal", "India", "China"};
        JLabel Country = new JLabel("Country");
        Country.setFont(font);
        JComboBox country = new JComboBox(countryNames);
        country.setFont(font);

        JButton save = new JButton("Save");
        save.setFont(font);
        JButton update = new JButton("Update");
        update.setFont(font);

        //set Location
        firstname.setBounds(15, 50, 150, 25);
        txtName.setBounds(200, 50, 300, 25);
        lastname.setBounds(15, 100, 150, 25);
        txtlastname.setBounds(200, 100, 300, 25);
        password.setBounds(15, 150, 100, 25);
        txtpassword.setBounds(200, 150, 300, 25);
        Gender.setBounds(15, 200, 100, 25);
        male.setBounds(200, 200, 100, 25);
        female.setBounds(350, 200, 100, 25);
        hobby.setBounds(15, 250, 100, 25);
        singing.setBounds(200, 250, 140, 25);
        dancing.setBounds(350, 250, 140, 25);
        reading.setBounds(500, 250, 140, 25);
        Country.setBounds(15, 300, 100, 25);
        country.setBounds(200, 300, 200, 25);
        save.setBounds(50, 400, 100, 25);
        update.setBounds(250, 400, 150, 25);

        //adding component
        //save.addActionListener(this);
        
        container.add(firstname);
        container.add(txtName);
        container.add(lastname);
        container.add(txtlastname);
        container.add(password);
        container.add(txtpassword);
        container.add(Gender);
        container.add(male);
        container.add(female);
        container.add(hobby);
        container.add(singing);
        container.add(dancing);
        container.add(reading);
        container.add(Country);
        container.add(country);
        container.add(save);
        container.add(update);

        this.setSize(800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Event Handling");
        this.getContentPane().setBackground(Color.orange);
        this.setResizable(false);
        this.setVisible(true);
        
    
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        txtName.setText("My name is marshal");
        container.setBackground(Color.red);
        
        
        
        

    }
    public static void main(String[]args){
        new EventHandlingExample();
    }

}
