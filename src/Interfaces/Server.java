package Interfaces;

//Imports
import static Interfaces.LogIn.u;
import static Interfaces.startApp.j;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        //Try with Server resourse
        try (ServerSocket server = new ServerSocket(8800);) {
            
        //--------------------------------Network-------------------------------
        
            System.out.println("Server waiting Connection...");
            
            //While to Accept Client
            while (true) {
                
                // Accept Socket 
                Socket incoming = server.accept();
               
                Runnable r = new MultiThread(incoming);
                Thread t = new Thread(r);
                t.start();
            
            }//while

        }//try

        //-------------------------------Catches--------------------------------
        
        catch (IOException ex) {
            j.showMessageDialog(null, "IO Erorr Happend: " + ex.getMessage());
        }         
        
    }//main
    
}//class
