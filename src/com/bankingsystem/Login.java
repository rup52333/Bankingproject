package com.bankingsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
   JButton login,signup,clear;
    JTextField cardTextField;JPasswordField pinTextField;
    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image l2 = l1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon l3 = new ImageIcon(l2);
        JLabel label = new JLabel(l3);
        add(label);
        JLabel text = new JLabel("Welcome to ATM");

        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel card = new JLabel("Card No:");
        card.setFont(new Font("Raleway", Font.BOLD, 28));
        card.setBounds(120, 150, 150, 30);
        add(card);
         cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        add(cardTextField);

        JLabel pinno = new JLabel("PIN:");
        pinno.setFont(new Font("Raleway", Font.BOLD, 30));
        pinno.setBounds(120, 220, 250, 30);
        add(pinno);
         pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        add(pinTextField);
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLUE);
        login.setForeground(Color.BLACK);
       login.addActionListener(this);

        add(login);


         clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLUE);
        clear.setForeground(Color.BLACK);       clear.addActionListener(this);

        add(clear);
         signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLUE);
        signup.setForeground(Color.BLACK); signup.addActionListener(this);
        add(signup);


        getContentPane().setBackground(Color.RED);

        label.setBounds(10, 10, 100, 100);
        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);

    }




    public void actionPerformed(ActionEvent ae) {
if(ae.getSource()==clear){
    cardTextField.setText("");
    pinTextField.setText("");

}
else if(ae.getSource()==login){

}

      else if(ae.getSource()==signup){

        }
}   public static void main(String[] args) {

        new Login();
    }



}
