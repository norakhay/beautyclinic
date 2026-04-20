package model;

import java.time.LocalDateTime;

public class Appointment {
    private Patient patient;
    private String serviceName; 
    private LocalDateTime dateTime;
    private double price;

    public Appointment(Patient patient, String serviceName, LocalDateTime dateTime, double price) {
        this.patient = patient;
        this.serviceName = serviceName;
        this.dateTime = dateTime;
        this.price = price;
        
       
        this.patient.addLoyaltyPoints((int) (price / 0.1));
        this.patient.addAppointmentToHistory(dateTime + ": " + serviceName + " ($" + price + ")");
    }

    public void displayReceipt() {
        System.out.println("\n--- Clinic Receipt ---");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Service: " + serviceName);
        System.out.println("Date: " + dateTime);
        System.out.println("Total Paid: $" + price);
        System.out.println("----------------------");
    }
}
