package server;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kunal Anand
 */

public class HandleAdminquescreation  implements Runnable {
    

    private Socket socket;
    ObjectInputStream objectInputStream;
    ObjectOutputStream objectOutputStream;
    Connection connection;
    
    public HandleAdminquescreation(Socket socket) {
        this.socket = socket;
        try {
            objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
          
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
                         
                                  try
                                  {
                                     /* 
                                      String s = null;
                                      int k=0;
                                      String key=(String) objectInputStream.readUTF();*/
                                      try
                                      {
                                          Class.forName("com.mysql.jdbc.Driver");
                                          String url = "jdbc:mysql://localhost:3306/SECUREQUIZ?zeroDateTimeBehavior=convertToNull";
                                          connection = DriverManager.getConnection(url, "root", "");
                                      }
                                      catch (SQLException | ClassNotFoundException ex) {
                                          Logger.getLogger(Handleadmin.class.getName()).log(Level.SEVERE, null, ex);
                                      }
                                      /*//System.out.println("ok123");
                                      String query="CREATE TABLE "+key+" (que_no int , que varchar(200) , A VARCHAR(200) , B VARCHAR(200) , C VARCHAR(200) , D VARCHAR(200) , CA VARCHAR(200) );";
                                      PreparedStatement preStat;
                                      try {
                                          preStat = connection.prepareStatement(query);
                                          preStat.executeUpdate();
                                      } catch (SQLException ex) {
                                          Logger.getLogger(HandleAdminquescreation.class.getName()).log(Level.SEVERE, null, ex);
                                      }*/
                                      for(int j=0;j<15;j++)
                                      { System.out.println("hi");
                                          String []str=new String[8];
                                        objectInputStream = new ObjectInputStream(socket.getInputStream());
                                      str[7] = (String) objectInputStream.readUTF();
                                      str[0] = (String) objectInputStream.readUTF();
                                      str[1] = (String) objectInputStream.readUTF();
                                      str[2] = (String) objectInputStream.readUTF();
                                      str[3] = (String) objectInputStream.readUTF();
                                      str[4] = (String) objectInputStream.readUTF();
                                      str[5] = (String) objectInputStream.readUTF();
                                      str[6] = (String) objectInputStream.readUTF();
                                      String code=(String) objectInputStream.readUTF();
                                      System.out.print("okk");
                                      PreparedStatement preStat;
                                       int i=0;
                                       String key=str[7];
                                       System.out.println("Message received");
                                       if("1".equals(code))
                                       {
                                           String query2 = "INSERT INTO "+key+" VALUES (?, ?, ?, ?, ?, ?, ?);";
                                      
                                       try {
                                         
                                          preStat = connection.prepareStatement(query2);
                                          preStat.setInt(1, Integer.valueOf(str[0]));
                                          preStat.setString(2, str[1]);
                                          preStat.setString(3, str[2]);
                                          preStat.setString(4, str[3]);
                                          preStat.setString(5, str[4]);
                                          preStat.setString(6, str[5]);
                                          preStat.setString(7, str[6]);
                                          preStat.executeUpdate();
                                           } catch (SQLException ex) {
                                          Logger.getLogger(HandleAdminquescreation.class.getName()).log(Level.SEVERE, null, ex);
                                           } 
                                      }
                                       if("2".equals(code))
                                       {
                                           int fav;
                                           System.out.println("I am in second case");
                                           fav = Integer.valueOf(str[0]);
                                           System.out.println(fav);
                                          String query2 = "UPDATE `"+key+"` SET `que` = '"+str[1]+"' , `A` = '"+str[2]+"' , `B` = '"+str[3]+"', `C` ='"+str[4]+"' , `D` = '"+str[5]+"' , `CA` = '"+str[6]+"' WHERE que_no = "+fav+"; ";
                                          try{
                                              System.out.println(query2);
                                          preStat = connection.prepareStatement(query2);
                                          preStat.executeUpdate();
                                          break;
                                           } catch (SQLException ex) {
                                          Logger.getLogger(HandleAdminquescreation.class.getName()).log(Level.SEVERE, null, ex);
                                           }    
                                       }
                                  }
                                  }
                                  catch (IOException ex) {
                                      Logger.getLogger(HandleAdminquescreation.class.getName()).log(Level.SEVERE, null, ex);
                                  }
                                  
                          }
    }

   




