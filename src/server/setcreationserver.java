/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.Handlestudentinfo;
import server.resultqueryserver;


/**
 *
 * @author Kunal Anand
 */
public class setcreationserver {
    public static void main(String args[]) {
        ServerSocket serverSocket;
        Socket socket;
        System.out.println("Server started");
        try {
            serverSocket = new ServerSocket(5410);
        } catch (IOException ex) {
            Logger.getLogger(setcreationserver.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        while(true)
        {
            try {
                socket = serverSocket.accept();
                System.out.println("Client Connected");
                Thread t = new Thread(new Handlesetcreation(socket));
                t.start();
            } catch (IOException ex) {
                Logger.getLogger(setcreationserver.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
    
}
