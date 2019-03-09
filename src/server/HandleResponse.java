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
public class HandleResponse implements Runnable {
    private Socket socket;
    ObjectInputStream objectInputStream;
    ObjectOutputStream objectOutputStream;
    Connection connection;
    
    public HandleResponse(Socket socket) {
        this.socket = socket;
        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {        }
    }

    @Override
    public void run() {
                                      
                                          
                                          try {
                                              
                                              
                                              String code=null,key=null,id=null;
                                              key=(String) objectInputStream.readUTF();
                                              System.out.println("key");
                                              id=(String) objectInputStream.readUTF();
                                              System.out.println(id);
                                              int k,i;
                                              System.out.println("ok1");
                                              String [] user_response=new String[15];
                                              String [] ans_response=new String[15];
                                                  //objectInputStream = new ObjectInputStream(socket.getInputStream());
                                                  for(i=0;i<15;i++)
                                                      try {
                                                          //objectInputStream = new ObjectInputStream(socket.getInputStream());
                                                          user_response[i] = (String) objectInputStream.readUTF();
                                                          System.out.println(user_response[i]);
                                                      } catch (IOException ex) {
                                                          //objectInputStream = new ObjectInputStream(socket.getInputStream());Logger.getLogger(HandleResponse.class.getName()).log(Level.SEVERE, null, ex);
                                                      }
                                                  
                                                  code = "1";
                                       
                                              i=0;
                                              k=0;
                                              System.out.println("Message received");
                                              try
                                              {
                                                  Class.forName("com.mysql.jdbc.Driver");
                                                  String url = "jdbc:mysql://localhost:3306/SECUREQUIZ?zeroDateTimeBehavior=convertToNull";
                                                  connection = DriverManager.getConnection(url, "root", "");
                                              }
                                              catch (SQLException | ClassNotFoundException ex) {
                                                  Logger.getLogger(HandleResponse.class.getName()).log(Level.SEVERE, null, ex);
                                              }
                                              String temp=Integer.toString(k+1);
                                              String query = "SELECT *FROM "+key+";";
                                              try {
                                                  PreparedStatement preStat;
                                                  preStat = connection.prepareStatement(query);
                                                  ResultSet result=null;
                                                  result = preStat.executeQuery();
                                                  while(result.next()){
                                                      int qno=result.getInt("que_no");
                                                      String str=result.getString("CA");
                                                      ans_response[qno-1]=str;
                                                      if(user_response[qno-1].equals(str))
                                                          i+=1;}
                                                  query="INSERT INTO test_details VALUES (?,?,?)";
                                                  preStat=connection.prepareStatement(query);
                                                  preStat.setString(1, id);
                                                  preStat.setString(2, key);
                                                  preStat.setString(3, String.valueOf(i));
                                                  preStat.executeUpdate();
                                              } catch (SQLException ex) {
                                                  Logger.getLogger(HandleResponse.class.getName()).log(Level.SEVERE, null, ex);
                                              }
                                              String r;
                                              System.out.println(i);
                                                r=String.valueOf(i);
                                      
                                                  try {
                                                      objectOutputStream.writeUTF(r);
                                                  } catch (IOException ex) {
                                                      Logger.getLogger(HandleResponse.class.getName()).log(Level.SEVERE, null, ex);
                                                  }
                                                  int p;
                                                  for(p=0;p<15;p++)
                                                  {
                                                      try {
                                                          objectOutputStream.writeUTF(ans_response[p]);
                                                      } catch (IOException ex) {
                                                          Logger.getLogger(HandleResponse.class.getName()).log(Level.SEVERE, null, ex);
                                                      }
                                                  }
                                              
                                              try {
                                                  objectOutputStream.flush();
                                              } catch (IOException ex) {
                                                  Logger.getLogger(HandleResponse.class.getName()).log(Level.SEVERE, null, ex);
                                              }
                                          } catch (IOException ex) {
                                              Logger.getLogger(HandleResponse.class.getName()).log(Level.SEVERE, null, ex);
                                          }
    }
}
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                          
                                         
                                         
                                      
                                      
                                      
                                      
                        
                                      
    
   





                                  
                                  
                         
           
        
    
   






