/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author Kunal Anand
 */
import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ResultQuery implements Runnable {
    private Socket socket;
    ObjectInputStream objectInputStream;
    ObjectOutputStream objectOutputStream;
    Connection connection;
    public ResultQuery(Socket socket) {
        this.socket = socket;
        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
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
            String user_id=(String) objectInputStream.readUTF();
            String key=(String) objectInputStream.readUTF();
            String query = "SELECT quiz_key,score FROM test_details WHERE userid="+user_id;
            PreparedStatement prestat;
            prestat = connection.prepareStatement(query);
            ResultSet result=prestat.executeQuery();
            prestat.executeQuery();
            while(result.next())
            {          
            String quiz_key=result.getString("quiz_key");
            String score=result.getString("score");
            if(key.equals(quiz_key))
            {
            objectOutputStream.writeUTF(score);
            break;
            }
            }
            objectOutputStream.flush();
        } catch (ClassNotFoundException | IOException | SQLException ex) {
            Logger.getLogger(ResultQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    }        
                
} 





