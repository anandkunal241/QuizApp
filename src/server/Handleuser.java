/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kunal Anand
 */

public class Handleuser implements Runnable {
    private Socket socket;
    ObjectInputStream objectInputStream;
    ObjectOutputStream objectOutputStream;
    Connection connection;
    
    public Handleuser(Socket socket) {
        this.socket = socket;
        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
          
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
                          try
                          {
                              String s = null;
                              int k=0;
                              
                              
                              String message1 = (String) objectInputStream.readUTF();
                              String message2 = (String) objectInputStream.readUTF();
                              int i = 0;
                                  System.out.println("Message received");
                                  try
                                  {
                                      Class.forName("com.mysql.jdbc.Driver");
                                      String url = "jdbc:mysql://localhost:3306/SECUREQUIZ?zeroDateTimeBehavior=convertToNull";
                                      connection = DriverManager.getConnection(url, "root", "");
                                  }
                                  catch (SQLException | ClassNotFoundException ex) {
                                      Logger.getLogger(Handleadmin.class.getName()).log(Level.SEVERE, null, ex);
                                  }
                                      String query2 = "SELECT * FROM user_login;";
                                      PreparedStatement preStat;
                              try {
                                  preStat = connection.prepareStatement(query2);
                              
                                      ResultSet result = preStat.executeQuery();
                                      String STU = null,pass = null;
                                      System.out.println("ok");
                                      while(result.next())
                                      {
                                          STU= result.getString("user_id");
                                          pass = result.getString("password");
                                          if((STU.equals(message1))&&(pass.equals(message2)))
                                          {
                                              k=1;
                                              
                                              break;
                                          }
                                      }
                                      System.out.print(k);
                                      } catch (SQLException ex) {
                                  Logger.getLogger(Handleadmin.class.getName()).log(Level.SEVERE, null, ex);
                              }
                                          if(k==1)
                                              s="allow Login";
                                          else
                                              s="INVALID CREDENTIALS";
                                          System.out.println(s);
                                          objectOutputStream.writeUTF(s);
                                          objectOutputStream.flush();
                                      } catch (IOException ex1) {
                                          Logger.getLogger(Handleadmin.class.getName()).log(Level.SEVERE, null, ex1);
                                      }
                                      
                                      
                                  }
                                  
                                  
                         
           
        
    }
   





