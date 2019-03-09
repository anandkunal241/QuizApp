/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
<<<<<<< HEAD
 * @author Kunal Anand
=======
 * @author Kunal
>>>>>>> 3fa75d1b6e499910d335edd94fb751dc04075654
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Handlestudentinfo implements Runnable {
    private Socket socket;
    ObjectInputStream objectInputStream;
      //ObjectOutputStream objectOutputStream;
     // ObjectOutputStream objectOutputStream;
    Connection connection;
    public Handlestudentinfo(Socket socket) {
        this.socket = socket;
        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

           
                
        try {
            String id = (String) objectInputStream.readUTF();
            int i = 0;
            System.out.println("Message received");
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/SECUREQUIZ?zeroDateTimeBehavior=convertToNull";
            connection = DriverManager.getConnection(url, "root", "");
            String query2 = "SELECT * FROM user_login;";
            PreparedStatement preStat;
            preStat = connection.prepareStatement(query2);
            ResultSet result = preStat.executeQuery();
            String STU = null,pass = null;
            System.out.println("ok");
            String name=null,branch=null,college=null;
            while(result.next())
            {
                STU= result.getString("user_id");
                // pass = result.getString("password");
                System.out.println(STU+"hlr\n");
                System.out.println(id+"lo\n");
                if(STU.equals(id))
                {
                    name=result.getString("name");
                    college=result.getString("college");
                    branch=result.getString("branch");
                    break;
                }
            }
            System.out.print(" "+name+" "+college+" "+branch);
            ObjectOutputStream  objectOutputStream;
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeUTF(name);
            objectOutputStream.writeUTF(college);
            objectOutputStream.writeUTF(branch);
            objectOutputStream.writeUTF(id);
            objectOutputStream.flush();
        } catch (IOException ex) {
            Logger.getLogger(Handlestudentinfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Handlestudentinfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Handlestudentinfo.class.getName()).log(Level.SEVERE, null, ex);
        }
                                          
                   
    }        
                
} 


