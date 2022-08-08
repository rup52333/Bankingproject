package com.bankingsystem;
import java.sql.*;
public class Conn {

    Connection c;
    Statement s;
    public Conn(){
        try{


            c=DriverManager.getConnection("jdbc:mysql:///bankingsystem","root","rup@1234");
       s=c.createStatement();


        }
        catch (Exception e){
            System.out.print(e);

        }


    }
}
