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
public class HandleGetQuestion implements Runnable {
    private Socket socket;
    ObjectInputStream objectInputStream;
    ObjectOutputStream objectOutputStream;
    Connection connection;
    
    public HandleGetQuestion (Socket socket) {
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
                              System.out.println("heheheheee");
                              String message1 = (String) objectInputStream.readUTF();
                              String message2 = (String) objectInputStream.readUTF();
                              //String key=(String) objectInputStream.readUTF();
                              int i = 0;
                                  System.out.println("Message received");
                                  System.out.println(message1+message2);
                                  try
                                  {
                                  try {
                                      Class.forName("com.mysql.jdbc.Driver");
                                  } catch (ClassNotFoundException ex) {
                                      Logger.getLogger(HandleGetQuestion.class.getName()).log(Level.SEVERE, null, ex);
                                  }
                                      String url = "jdbc:mysql://localhost:3306/SECUREQUIZ?zeroDateTimeBehavior=convertToNull";
                                      connection = DriverManager.getConnection(url, "root", "");
                                      /*String query = "CREATE TABLE" +key+ " (queno VARCHAR(10) NOT NULL,que VARCHAR(200) NOT NULL,A VARCHAR(10) NOT NULL,B VARCHAR(10) NOT NULL,C VARCHAR(10) NOT NULL,D VARCHAR(10) NOT NULL,CA VARCHAR(10) NOT NULL)";
                                      PreparedStatement prestat;
                                      prestat = connection.prepareStatement(query);
                                      prestat.executeUpdate()*/
                                      String query2 = "SELECT * FROM "+message1+";";
                                      PreparedStatement preStat;
                                  preStat = connection.prepareStatement(query2);
                                      ResultSet result = preStat.executeQuery();
                                      String res = null;
                                      int temp=Integer.valueOf(message2);
                                      System.out.println("ok");
                                      while(result.next())
                                      {
                                          if(result.getInt("que_no")==temp)
                                          break;
                                      }
                                      objectOutputStream.writeUTF(result.getString("que"));
                                      objectOutputStream.writeUTF(result.getString("A"));
                                      objectOutputStream.writeUTF(result.getString("B"));
                                      objectOutputStream.writeUTF(result.getString("C"));
                                      objectOutputStream.writeUTF(result.getString("D"));
                                      objectOutputStream.flush();
                                      System.out.print(k);
                                      } catch (SQLException ex) {
                                  Logger.getLogger(Handleadmin.class.getName()).log(Level.SEVERE, null, ex);
                              } catch (IOException ex) {
                              }                          
                                    
                          } catch (IOException ex) {
            Logger.getLogger(Handleadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
                                      
                          }
                                  
                                  
                         
           
        
    }
   







