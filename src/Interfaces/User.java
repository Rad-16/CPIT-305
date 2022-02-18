package Interfaces;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renad
 */
public class User {
    
//----------------------------Variables----------------------------//
    private String ID;
    private String password;
    private ArrayList<Appointment> myAppointment;

//---------------------------Constructer--------------------------//
    public User(String ID, String password) {
        this.ID = ID;
        this.password = password;
        this.myAppointment = myAppointment;
    }

//-------------------------Search Method--------------------------//
    public static User search(User u, ArrayList<User> usersList){
        for (int i = 0; i < usersList.size(); i++) {
            if (u.getID().equals(usersList.get(i).getID()) && u.getPassword().equals(usersList.get(i).getPassword())) {
                return u;
            }
        }
        return null;
    }
    
    
//-----------------------------Getter-----------------------------//
    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Appointment> getMyAppointment() {
        return myAppointment;
    }

//-----------------------------Setter-----------------------------//
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMyAppointment(ArrayList<Appointment> myAppointment) {
        this.myAppointment = myAppointment;
    }
    
    
}//class
