package Interfaces;

//Imports
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//Class to make Multiple Clients
public class MultiThread implements Runnable {

    private Socket incoming;

     public MultiThread(Socket incoming) {
        this.incoming = incoming;
    }
                   
    @Override
    public void run() {
        
        //try with resourse
        try (Scanner in = new Scanner(incoming.getInputStream());
             PrintWriter out = new PrintWriter(incoming.getOutputStream(), true);) {
            
            //When New Client Connect
            System.out.println("New Client Connect, ID: " + in.nextInt());
            
            //if Client Add Request, Donate or Disconnect
            while (in.hasNextLine()) {
                    String str = in.nextLine();
                    System.out.println(str);
            }//while
                
        }//try
        
        //IO Exception
        catch (IOException ex) {
            
        }//catch
        
    }//run Method
    
}//class
