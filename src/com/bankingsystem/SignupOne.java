package com.bankingsystem;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
  long random;
  JTextField nameTextfield,fnameTextfield,dobTextfield,emailTextfield,adressTextfield,cityTextfield,pinTextfield,stateTextfield;
 JRadioButton male,female,other,married,unmarried;
    JDateChooser  date;
    JButton next;


    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

   SignupOne() {
       setLayout(null);
       Random ran=new Random();

       long random=Math.abs(ran.nextLong()%9000L+1000L);
       JLabel formno=new JLabel("APLLICATION FORM NO."+random);
       formno.setFont(new Font("Raleway",Font.BOLD,38));
       formno.setBounds(140,20,600,40);
       add(formno);
       JLabel personalDetails=new JLabel("Page 1:Personal Details");
       personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
       personalDetails.setBounds(290,60,400,30);
       add(personalDetails);
       JLabel name=new JLabel("Name:");
       name.setFont(new Font("Raleway",Font.BOLD,30));
       name.setBounds(100,140,100,30);
       add(name);
       nameTextfield=new JTextField();
       nameTextfield.setFont(new Font("Raleway",Font.BOLD,14));
       nameTextfield.setBounds(320,140,400,30);
       add(nameTextfield);
       JLabel father=new JLabel("Father's Name:");
       father.setFont(new Font("Raleway",Font.BOLD,30));
       father.setBounds(100,190,300,30);
       add(father);
        fnameTextfield=new JTextField();
       fnameTextfield.setFont(new Font("Raleway",Font.BOLD,14));
       fnameTextfield.setBounds(320,190,400,30);
       add(fnameTextfield);

       JLabel dob=new JLabel("Date of Birth:");
       dob.setFont(new Font("Raleway",Font.BOLD,30));
       dob.setBounds(100,240,300,30);
       add(dob);
       date=new JDateChooser();
       date.setBounds(320,240,400,30);
       date.setForeground(new Color(105,105,105));
       add(date);
       getContentPane().setBackground(Color.white);
       JLabel gender=new JLabel("Gender:");
       gender.setFont(new Font("Raleway",Font.BOLD,30));
       gender.setBounds(100,290,300,30);
       add(gender);
        male=new JRadioButton("Male");
       male.setBounds(300,290,60,30);
       add(male);
       male.setBackground(Color.white);
        female=new JRadioButton("Female");
       female.setBounds(450,290,120,30);
       female.setBackground(Color.white);
       add(female);

       ButtonGroup gendergroup=new ButtonGroup();
       gendergroup.add(male);
       gendergroup.add(female);
       JLabel email=new JLabel("Email Adress:");
       email.setFont(new Font("Raleway",Font.BOLD,30));
       email.setBounds(100,340,300,30);
       add(email);
       emailTextfield=new JTextField();
       emailTextfield.setFont(new Font("Raleway",Font.BOLD,14));
       emailTextfield.setBounds(320,340,400,30);
       add(emailTextfield);

       JLabel marital=new JLabel("Marital Status:");
       marital.setFont(new Font("Raleway",Font.BOLD,30));
       marital.setBounds(100,390,300,30);
       add(marital);
        married=new JRadioButton("Married");
       married.setBounds(320,390,100,30);
       add(married);
       married.setBackground(Color.white);
        unmarried=new JRadioButton("Unmarried");
       unmarried.setBounds(450,390,100,30);
       unmarried.setBackground(Color.white);
       add(unmarried);
        other=new JRadioButton("Other");

       other.setBounds(630,390,100,30);
       other.setBackground(Color.white);
       add(other);
       ButtonGroup maritalgroup=new ButtonGroup();
       gendergroup.add(married);
       gendergroup.add(unmarried);
       gendergroup.add(other);
       JLabel adress=new JLabel("Adress:");
       adress.setFont(new Font("Raleway",Font.BOLD,30));
       adress.setBounds(100,440,300,30);
       add(adress);
       adressTextfield=new JTextField();
       adressTextfield.setFont(new Font("Raleway",Font.BOLD,14));
       adressTextfield.setBounds(320,440,400,30);
       add(adressTextfield);

       JLabel city=new JLabel("City:");
       city.setFont(new Font("Raleway",Font.BOLD,30));
       city.setBounds(100,490,300,30);
       add(city);
       cityTextfield=new JTextField();
       cityTextfield.setFont(new Font("Raleway",Font.BOLD,14));
       cityTextfield.setBounds(320,490,400,30);
       add(cityTextfield);

       JLabel state=new JLabel("State:");
       state.setFont(new Font("Raleway",Font.BOLD,30));
       state.setBounds(100,540,300,30);
       add(state);
       stateTextfield=new JTextField();
       stateTextfield.setFont(new Font("Raleway",Font.BOLD,14));
       stateTextfield.setBounds(320,540,400,30);
       add(stateTextfield);


       JLabel pin=new JLabel("Pin Code:");
       pin.setFont(new Font("Raleway",Font.BOLD,30));
       pin.setBounds(100,590,300,30);
       add(pin);
       pinTextfield=new JTextField();
       pinTextfield.setFont(new Font("Raleway",Font.BOLD,14));
       pinTextfield.setBounds(320,590,400,30);
       add(pinTextfield);
       next=new JButton("Next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.white);
       next.setFont(new Font("Raleway",Font.BOLD,14));
       next.setBounds(420,660,80,30);
       next.addActionListener(this::actionPerformed);
       add(next);
       getContentPane().setBackground(Color.CYAN);


    setSize(850, 800);
    setLocation(350,10);
    setVisible(true);
    }
public void actionPerformed(ActionEvent ae){
       String formno=first;
       String name=nameTextfield.getText();
       String fname=fnameTextfield.getText();
       String dob=((JTextField) date.getDateEditor().getUiComponent()).getText();
       String gender =null;
       if(male.isSelected()){
           gender="Male";
       }
       else if(female.isSelected()){
           gender="Female";
       }
       String email=emailTextfield.getText();
       String marital=null;
       if(married.isSelected()){
           marital="Married";

       }
       else if(unmarried.isSelected()){
           marital="Unmarried";
       }
       else if(other.isSelected()){
           marital="Other";
       }
      String adress=adressTextfield.getText();
       String city=cityTextfield.getText();
       String state=stateTextfield.getText();
       String pin=pinTextfield.getText();
       try{
           if(name.equals("")){
               JOptionPane.showMessageDialog(null,"Name is Reqired");

           }
           else{

              Conn c=new Conn();

              String query="insert into registration values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+adress+"','"+city+"','"+pin+"','"+state+"')";
          c.s.executeUpdate(query);

           }



       }
       catch (Exception e){
           System.out.print(e);


       }



    }

    public static void main(String[] args) {
        new SignupOne();
    }



}
