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
    private ArrayList<Appointment> myAppointment = new ArrayList();
    private static ArrayList<User> users = new ArrayList();
    private boolean Eligible;

//---------------------------Constructer--------------------------//
    public User(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }

//-------------------------Search Method--------------------------//
    public static User search(User u){
        for (int i = 0; i < users.size(); i++) {
            if (u.getID().equals(users.get(i).getID()) && u.getPassword().equals(users.get(i).getPassword())) {
                return u;
            }
        }
        return null;
    }
    
    public static void add(){
        
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

    public static ArrayList<User> getUsers() {
        return users;
    }

    public boolean isEligible() {
        return Eligible;
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

    public static void setUsers(ArrayList<User> users) {
        User.users = users;
    }

    public void setEligible(boolean Eligible) {
        this.Eligible = Eligible;
    }
    
    
    
}//class
