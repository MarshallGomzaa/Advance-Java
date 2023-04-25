/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.awt.GridLayout;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Marshall
 */
public class ProtectedSiteAccess {
    public static void main(String[]args) throws MalformedURLException, IOException{
        JFrame frame=new JFrame();
        JPanel panel=new JPanel(new GridLayout(2,2));
        JLabel lbl_username=new JLabel("Username");
        JTextField username=new JTextField();
       // username.setBounds(100, 100, 100, 20);
       
       
        JLabel lbl_password=new JLabel("Password");
        JPasswordField password=new JPasswordField();
       // password.setBounds(100, 100, 100, 20);
        
        panel.add(lbl_username);
        panel.add(username);
        panel.add(lbl_password);
        panel.add(password);
        
        int res=JOptionPane.showConfirmDialog(frame,panel,"Login",
                JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        if(res==JOptionPane.OK_OPTION){
            String u=username.getText();
            char[] p=password.getPassword();
            
            Authenticator.setDefault(new CustomAuthenticator(u,p));
             try{
                 URL url=new URL("http://www.asmt.edu.np/dashboard.html");
                 HttpURLConnection conn=(HttpURLConnection)url.openConnection();
                 conn.setRequestMethod("GET");
                 
                InputStream stream=conn.getInputStream();
                InputStreamReader r=new InputStreamReader(stream);
                
                int c;
            while((c=r.read())!=-1){
            System.out.print((char) c);
            
            }
                        
             }catch(IOException e){
                System.out.print(e.getMessage()); 
             }
        }else{
            System.out.print("You cancelled the login");
        }
    }
    
    private static class CustomAuthenticator extends Authenticator {
        private String uname;
        private char[] pass;

    public CustomAuthenticator(String u, char[] p) {
        this.uname=u;
        this.pass=p;
    }
        
        @Override
        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(uname, pass);
        }
        }
}
