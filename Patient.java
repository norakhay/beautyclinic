package model;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String patientId;
    private String name;
    private String phoneNumber;
    private String email;
    private int loyaltyPoints;
    private List<String> appointmentHistory; 

    public Patient(String patientId, String name, String email, String phoneNumber) {
        this.patientId = patientId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.loyaltyPoints = 0;
        this.appointmentHistory = new ArrayList<>();
    }

    

    public void addLoyaltyPoints(int points) {
        if (points > 0) {
            this.loyaltyPoints += points;
            System.out.println(points + " points added to " + name + ". Total: " + loyaltyPoints);
        }
    }

    public boolean redeemPoints(int pointsToUse) {
        if (pointsToUse <= this.loyaltyPoints) {
            this.loyaltyPoints -= pointsToUse;
            System.out.println(pointsToUse + " points redeemed! Remaining: " + loyaltyPoints);
            return true;
        } else {
            System.out.println("Error: Not enough points. Current balance: " + loyaltyPoints);
            return false;
        }
    }

    public void addAppointmentToHistory(String appointmentDetails) {
        this.appointmentHistory.add(appointmentDetails);
    }


    public String getPatientId() { 
        return patientId; }

    public String getName() { 
        return name; }
    public void setName(String name) {
         this.name = name; }

    public String getPhoneNumber() { 
        return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { 
        this.phoneNumber = phoneNumber; }

    public String getEmail() {
         return email; }
    public void setEmail(String email) { 
        this.email = email; }

    public int getLoyaltyPoints() { 
        return loyaltyPoints; }

    public List<String> getAppointmentHistory() { 
        return appointmentHistory; }

    @Override
    public String toString() {
        return " [ID: " + patientId + "] Name: " + name + 
               " | Email: " + email + 
               " | Points: " + loyaltyPoints;
    }
}