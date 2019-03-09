package server;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kunal Anand
 */
public class resultqueryserver {
     public static void main(String args[]) {
        ServerSocket serverSocket;
        Socket socket;
        System.out.println("Server started");
        try {
            serverSocket = new ServerSocket(5408);
        } catch (IOException ex) {
            Logger.getLogger(resultqueryserver.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        while(true)
        {
            try {
                socket = serverSocket.accept();
                System.out.println("Client Connected");
                Thread t = new Thread(new ResultQuery(socket));
                t.start();
            } catch (IOException ex) {
                Logger.getLogger(resultqueryserver.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
