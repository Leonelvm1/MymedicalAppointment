package Model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del Model.Doctor asignado es: " + name);
        this.speciality = speciality;
    }

    //Comportamientos
    ArrayList<AvailableApoitment> availableApoitments = new ArrayList<>();
    public void addAvailableAppoitment(Date date, String time){
        availableApoitments.add(new AvailableApoitment(date, time));
    }

    public ArrayList<AvailableApoitment> getAvailableAppoitment(){
        return availableApoitments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableApoitments.toString();
    }

    public static class AvailableApoitment{
        private int id_availableApoitment;
        private Date date;
        private String time;

        public AvailableApoitment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId_availableApoitment() {
            return id_availableApoitment;
        }

        public void setId_availableApoitment(int id_availableApoitment) {
            this.id_availableApoitment = id_availableApoitment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available apointments \nDate: " + date + "\nTime: " + time;
        }
    }
}
