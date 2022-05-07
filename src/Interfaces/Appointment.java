package Interfaces;

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

    @Override
    public String toString() {
        return "- " + time + ", at " + center + ", on " + date;
    }
    
}//class
