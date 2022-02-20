package Interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renad
 */
public class startApp {

    public User u;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //----------------------------------Try-----------------------------------//

        //try to catch File and IO Exception
        try (BufferedReader  in = new BufferedReader(new FileReader("Users.txt"));){
            
            //While to get user Info, and add it to User Array
            String s;
            while((s=in.readLine()) != null){
                String[] info = s.split("_");
                User.getUsers().add(new User(info[0], info[1]));
            }
            
            //Start from Login
            LogIn n = new LogIn();
            n.setVisible(true);
            
        } 
        
    //--------------------------------Catches---------------------------------//
        
        //File Exception
        catch (FileNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        //IO Exception
        catch (IOException ex) {
            Logger.getLogger(startApp.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
}
