/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Kunal Anand
 */

public class Handleforgotpassword implements Runnable {
    private Socket socket;
    ObjectInputStream objectInputStream;
    ObjectOutputStream objectOutputStream;
    Connection connection;
    
    public Handleforgotpassword(Socket socket) {
        this.socket = socket;
        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
          
        } catch (IOException e) {
        }
    }

    @Override
    public void run() {
                          try
                          {
                              String user_id=(String) objectInputStream.readUTF();
                              String password=(String) objectInputStream.readUTF();
                                  System.out.println("Message received");
                                  try
                                  {
                                      Class.forName("com.mysql.jdbc.Driver");
                                      String url = "jdbc:mysql://localhost:3306/SECUREQUIZ?zeroDateTimeBehavior=convertToNull";
                                      connection = DriverManager.getConnection(url, "root", "");
                                  }
                                  catch (SQLException | ClassNotFoundException ex) {
                                      Logger.getLogger(Handleforgotpassword.class.getName()).log(Level.SEVERE, null, ex);
                                  }
                                     String query="UPDATE `user_login` SET `password`='"+password+"' WHERE user_id = '"+user_id+"';";
                                      PreparedStatement preStat;
                              try {
                                     preStat = connection.prepareStatement(query);
                                     preStat.executeUpdate();
                                      } catch (SQLException ex) {
                                  Logger.getLogger(Handleforgotpassword.class.getName()).log(Level.SEVERE, null, ex);
                              }
                                              String s="succesfully changed password";
                                              
                                              
                                              System.out.println(s);
                                              //objectOutputStream.writeUTF(s);
                                              //objectOutputStream.flush();
                                      } catch (IOException ex1) {
                                          Logger.getLogger(Handleforgotpassword.class.getName()).log(Level.SEVERE, null, ex1);
                                      }
                                      
                                      
                                  }
                                  
                                  
                     }
   

