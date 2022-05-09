package Interfaces;

//Import
import java.util.ArrayList;

//Class To Make User
public class User {

//----------------------------Variables----------------------------//
    private String ID;
    private String password;
    private ArrayList<Appointment> myAppointment = new ArrayList();
    private static ArrayList<User> users = new ArrayList();
    private int Eligible = -1;

//---------------------------Constructer--------------------------//
    public User(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }

//-------------------------Search Method--------------------------//
    public static User search(User u) {
        for (int i = 0; i < users.size(); i++) {
            if (u.getID().equals(users.get(i).getID()) && u.getPassword().equals(users.get(i).getPassword())) {
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

    public static ArrayList<User> getUsers() {
        return users;
    }

    public int isEligible() {
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

    public void setEligible(int Eligible) {
        this.Eligible = Eligible;
    }

}//class
