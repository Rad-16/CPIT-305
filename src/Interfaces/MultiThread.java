package Interfaces;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MultiThread implements Runnable {

    private Socket incoming;

    public MultiThread(Socket incoming) {
        this.incoming = incoming;
    }
                   
    @Override
    public void run() {
        try (Scanner in = new Scanner(incoming.getInputStream());
             PrintWriter out = new PrintWriter(incoming.getOutputStream(), true);) {
            
            System.out.println("New Client Connect, ID: " + in.nextInt());
            
            while (in.hasNextLine()) {
                    String str = in.nextLine();
                    System.out.println(str);
                    
                }
                
        } 
        
        catch (IOException ex) {
            
        }
    }
    
}
