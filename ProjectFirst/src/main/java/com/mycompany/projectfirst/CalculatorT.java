/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectfirst;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Marshall
 */
public class CalculatorT {
       public static void main(String[] args) {
      /* Scanner scanner = new Scanner(System.in);
       double num1, num2, result;
       char operator;
       */
        JFrame frame=new JFrame();
        Container container= frame.getContentPane();
        container.setLayout(null);
        Font font = new Font("Serif", Font.BOLD, 20);
        Font font1 = new Font("Serif", Font.BOLD, 20);
        JButton one= new JButton("1");
        one.setFont(font);
        JButton two = new JButton("2");
        two.setFont(font);
        JButton three = new JButton("3");
        three.setFont(font);
        JButton four= new JButton("4");
        four.setFont(font);

        JButton five= new JButton("5");
        five.setFont(font);
        JButton six = new JButton("6");
        six.setFont(font);
        JButton seven= new JButton("7");
        seven.setFont(font);
        JButton eight = new JButton("8");
        eight.setFont(font);
        JButton nine= new JButton("9");
        nine.setFont(font);
        JButton zero = new JButton("0");
        zero.setFont(font);
        JButton point = new JButton(".");
        point.setFont(font);
        JButton equals= new JButton("=");
        equals.setFont(font);
        JButton minus = new JButton("-");
        minus.setFont(font);
        JButton times= new JButton("x");
        times.setFont(font);
        JButton devide = new JButton("/");
        devide.setFont(font);
        JButton plus = new JButton("+");
        plus.setFont(font);
        
        JLabel display=new JLabel("  ");
        display.setFont(font1);
        JTextField Display=new JTextField();
        Display.setFont(font1);
        
        /*
               System.out.print("Enter first number: ");
       num1 = scanner.nextDouble();

       System.out.print("Enter second number: ");
       num2 = scanner.nextDouble();

       System.out.print("Enter an operator (+, -, *, /): ");
       operator = scanner.next().charAt(0);

       switch (operator) {
           case '+':
               result = num1 + num2;
               System.out.println(num1 + " + " + num2 + " = " + result);
               break;
           case '-':
               result = num1 - num2;
               System.out.println(num1 + " - " + num2 + " = " + result);
               break;
           case '*':
               result = num1 * num2;
               System.out.println(num1 + " * " + num2 + " = " + result);
               break;
           case '/':
               if (num2 == 0) {
                   System.out.println("Cannot divide by zero");
                   return;
               }
               result = num1 / num2;
               System.out.println(num1 + " / " + num2 + " = " + result);
               break;
           default:
               System.out.println("Invalid operator");
               break;
       }
       */
        one.setBounds(40,100,50,30);
        two.setBounds(100,100,50,30);
        three.setBounds(160,100,50,30);
        four.setBounds(40,150,50,30);
        five.setBounds(100,150,50,30);
        six.setBounds(160,150,50,30);
        seven.setBounds(40,200,50,30);
        eight.setBounds(100,200,50,30);
        nine.setBounds(160,200,50,30);
        zero.setBounds(40,250,50,30);
        point.setBounds(100,250,50,30);
        plus.setBounds(160,250,50,30);
        equals.setBounds(220,250,50,30);
        minus.setBounds(220,100,50,30);
        times.setBounds(220,150,50,30);
        devide.setBounds(220,200,50,30);
        display.setBounds(20, 20, 400, 300);
        Display.setBounds(40, 10, 300, 80);
        
        
        container.add(one);
        container.add(two);
        container.add(three);
        container.add(four);
        container.add(five);
        container.add(six);
        container.add(seven);
        container.add(eight);
        container.add(nine);
        container.add(zero);
        container.add(point);
        container.add(equals);
        container.add(minus);
        container.add(times);
        container.add(devide);
        container.add(plus);
        container.add(display);
        container.add(Display);
        
        
        
        

       //scanner.close();
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Registration Form");
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setResizable(false);
        frame.setVisible(true);
        
        
        
       }
}
