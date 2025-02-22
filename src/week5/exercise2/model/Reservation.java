/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.exercise2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author FPT
 */
public class Reservation {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mma");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private String bookingID;
    private String customerName;
    private String phoneNumber;
    private int roomNumber;
    LocalDate dateTime;
    FlightInformation flightInformation;
    
    public Reservation(String bookingID, String customerName, String phoneNumber, int roomNumber, LocalDate dateTime, FlightInformation flightInformation) {      
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.dateTime = dateTime;
        this.flightInformation = flightInformation;
    }

    public Reservation() {
        this.bookingID = "";
        this.customerName = "";
        this.phoneNumber = "";
        this.roomNumber = 0;
        this.dateTime = null;
        this.flightInformation = null;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingID + "\n" + "Customer Name: " + customerName + "\n" + "Phone Number: " + phoneNumber + "\n" + "Room number: " + roomNumber + "\n" + "Date Time: " + dateTime.format(formatter2) + "\n"
                + flightInformation;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public FlightInformation getFlightInformation() {
        return flightInformation;
    }

    public void setFlightInformation(FlightInformation flightInformation) {
        this.flightInformation = flightInformation;
    }
    
}
