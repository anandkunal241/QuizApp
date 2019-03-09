package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
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
public class admininfoserver {
    
    
    
    
    public static void main(String args[]) {
        ServerSocket serverSocket;
        Socket socket;
        System.out.println("Server started");
        try {
            serverSocket = new ServerSocket(5411);
        } catch (IOException ex) {
            Logger.getLogger(studentinfoserver.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        while(true)
        {
            try {
                socket = serverSocket.accept();
                System.out.println("Client Connected");
                Thread t = new Thread(new Handleadmininfo(socket));
                t.start();
            } catch (IOException ex) {
                Logger.getLogger(studentinfoserver.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

