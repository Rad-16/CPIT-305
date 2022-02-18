package Interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renad
 */
public class Appointment {
    
    private String date;
    private String time;
    private String center;

    public Appointment(String date, String time, String center) {
        this.date = date;
        this.time = time;
        this.center = center;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getCenter() {
        return center;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setCenter(String center) {
        this.center = center;
    }
    
    
}
