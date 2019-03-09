/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import java.io.*;
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
public class Handleusignup implements Runnable {
    private Socket socket;
    ObjectInputStream objectInputStream;
    Connection connection;
    public Handleusignup(Socket socket) {
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
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/SECUREQUIZ";
            connection = DriverManager.getConnection(url, "root", "");
            String name = (String) objectInputStream.readUTF();
            String branch = (String) objectInputStream.readUTF();
            String college= (String) objectInputStream.readUTF();
            String pass= (String) objectInputStream.readUTF();
            String id = (String) objectInputStream.readUTF();
            String query1 = "INSERT INTO user_login VALUES (?, ?, ?, ?, ?)";
            PreparedStatement prestat;
            prestat = connection.prepareStatement(query1);
            prestat.setString(1, id);
            prestat.setString(2, pass);
            prestat.setString(3, name);
            prestat.setString(4, branch);
            prestat.setString(5, college
            );
            prestat.executeUpdate();
           // System.out.println(name+branch+college+pass+id);
        
        } catch (ClassNotFoundException | IOException | SQLException ex) {
            Logger.getLogger(Handleusignup.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    }        
                
} 


