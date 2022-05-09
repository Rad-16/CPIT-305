package Interfaces;

//Imports
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class startApp {

    //Variables
    static Scanner in;
    static PrintWriter out;
    protected static ArrayList<String> clients = new ArrayList();
    static JOptionPane j= new JOptionPane();
  
    public static void main(String[] args) {
        
        //Try with Connection resourse
        try (Connection con = DriverManager.getConnection("jdbc:ucanaccess://Users_Database.accdb");) {
            
        //----------------------Get User From The Database----------------------
            
            //Create statement and excute
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM Users");

            //Get user Info, and Add them to User Array
            while (rs.next()) {
                long ID = rs.getLong("id");
                String Password = rs.getString("Password");
                User.getUsers().add(new User((ID + ""), Password));
            }
            
        //--------------------------------Login---------------------------------
        
            LogIn L = new LogIn();
            L.setVisible(true);
            
        //----------------------------Create Client-----------------------------
        
            Socket client = new Socket("127.0.0.1", 8800);
            
            in = new Scanner(client.getInputStream());
            out = new PrintWriter(client.getOutputStream(), true);
            
        }//try 

        //-------------------------------Catches--------------------------------
        
        //File Exception
        catch (FileNotFoundException ex) {
            j.showMessageDialog(null, "The File Not Found");
        }
        
        //IO Exception
        catch (IOException ex) {
            j.showMessageDialog(null, "There is an IO Erorr :" + ex.getMessage());
        } 

        //SQL Exception
        catch (SQLException ex) {
            j.showMessageDialog(null, "There is an SQL Erorr");
        } 
                
        //Other Erorr
        catch (Exception e) {
            j.showMessageDialog(null, "Erorr Happend: " + e.getMessage());
        }

    }//main

}//class
