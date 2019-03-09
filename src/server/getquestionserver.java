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
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class getquestionserver {

    public static void main(String args[]) {
        ServerSocket serverSocket;
        Socket socket;
        System.out.println("Server started");
        try {
            serverSocket = new ServerSocket(5406);
        } catch (IOException ex) {
            Logger.getLogger(getquestionserver.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        while(true)
        {               
            try {
                socket = serverSocket.accept();
                System.out.println("Client Connected");
                Thread t = new Thread(new HandleGetQuestion(socket));
                t.start();
            } catch (IOException ex) {
                Logger.getLogger(getquestionserver.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

}





