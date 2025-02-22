/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.exercise2.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

/**
 *
 * @author FPT
 */
public class FlightInformation {
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mma");
    private String flightNumber; private String seatNumber; private LocalDateTime timePickUp;
    public FlightInformation() {
        this.flightNumber="";
        this.seatNumber="";
        this.timePickUp=null;
    }

    public FlightInformation(String flightNumber, String seatNumber, LocalDateTime timePickUp) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.timePickUp = timePickUp;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public LocalDateTime getTimePickUp() {
        return timePickUp;
    }

    public void setTimePickUp(LocalDateTime timePickUp) {
        this.timePickUp = timePickUp;
    }

    @Override
    public String toString() {
        return "Flight number: "+flightNumber+"\n"+
                "Seatnumber: "+seatNumber + "\n"+
                "TimePickup: "+timePickUp.format(formatter)+"\n";
    }
    
}
