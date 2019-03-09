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
public class Handlesetcreation implements Runnable{
    private Socket socket;
    ObjectInputStream objectInputStream;
    ObjectOutputStream objectOutputStream;
    Connection connection;
    
    public Handlesetcreation(Socket socket) {
        this.socket = socket;
        try {
            objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
           objectInputStream=new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void run() {                            
        try {
            String s = null;
            int k=0;
            
            String key = null;
            try {
                
                String keyer = (String) objectInputStream.readUTF();
                key=keyer;
            } catch (IOException ex) {
                Logger.getLogger(Handlesetcreation.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Handlesetcreation.class.getName()).log(Level.SEVERE, null, ex);
            }
            String url = "jdbc:mysql://localhost:3306/SECUREQUIZ?zeroDateTimeBehavior=convertToNull";
            connection = DriverManager.getConnection(url, "root", "");
            System.out.println("ok123");
            String query="CREATE TABLE "+key+" (que_no int , que varchar(200) , A VARCHAR(200) , B VARCHAR(200) , C VARCHAR(200) , D VARCHAR(200) , CA VARCHAR(200) );";
            PreparedStatement preStat;
            preStat = connection.prepareStatement(query);
            preStat.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Handlesetcreation.class.getName()).log(Level.SEVERE, null, ex);
        }
                                     
                                  
    }
    
}
