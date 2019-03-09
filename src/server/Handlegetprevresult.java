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
 * @author Kunal Anand
 */
public class Handlegetprevresult implements Runnable{
     private Socket socket;
    ObjectInputStream objectInputStream;
    Connection connection;
    public Handlegetprevresult(Socket socket) {
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
            String key=(String) objectInputStream.readUTF();
            int i = 0;
            System.out.println("M");
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/SECUREQUIZ?zeroDateTimeBehavior=convertToNull";
            connection = DriverManager.getConnection(url, "root", "");
            String query2 = "SELECT * FROM test_details;";
            PreparedStatement preStat;
            preStat = connection.prepareStatement(query2);
            ResultSet result = preStat.executeQuery();
            String STU = null,quizkey = null,score = null;
            System.out.println("ok");
            String name=null,branch=null,college=null;
            while(result.next())
            {
                STU= result.getString("userid");
                quizkey=result.getString("quiz_key");
                System.out.println(quizkey+" "+key);
                System.out.println(STU+" "+id);
                if(STU.equals(id)&&quizkey.equals(key))
                {
                    score=result.getString("score");
                    break;
                }
            }
            System.out.print(score);
            ObjectOutputStream  objectOutputStream;
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeUTF(score);
            objectOutputStream.flush();
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Handlestudentinfo.class.getName()).log(Level.SEVERE, null, ex);
        }
                                          
                   
    }        
    
}
