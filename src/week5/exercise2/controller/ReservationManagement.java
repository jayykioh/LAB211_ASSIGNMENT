/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.exercise2.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import week4.exercise1.view.CheckInput;
import week5.exercise2.model.FlightInformation;
import week5.exercise2.model.Reservation;

/**
 *
 * @author FPT
 */
public class ReservationManagement {
    
    private Scanner scanner = new Scanner(System.in);
    private List<Reservation> reservations = new ArrayList<>();
    
    public String isValidID() {
        while (true) {
            System.out.print("ID (6 digits): ");
            String id = scanner.nextLine().trim();
            if (id.matches("\\d{6}") && reservations.stream().noneMatch(r -> r.getBookingID().equals(id))) {
                return id;
            }
            System.out.println("Must be 6 digits and unique.");
        }
    }
    
    public String isValidPhone() {
        while (true) {
            System.out.print("Phone (12 digits): ");
            String phone = scanner.nextLine().trim();
            if (phone.matches("\\d{12}")) {
                return phone;
            }
            System.out.println("phone Must be exactly 12 digits.");
        }
    }
    
    public String isValidRoom() {
        while (true) {
            System.out.print("Room (4 digits): ");
            String room = scanner.nextLine().trim();
            if (room.matches("\\d{4}")) {
                return room;
            }
            System.out.println("room Must be exactly 4 digits.");
        }
    }
    
    public void createReservation() {
        System.out.println("\n*** Create new reservation ***");
        
        String bookingID = isValidID();
        System.out.println("Customer Name: ");
        String customerName = CheckInput.inputString();
        String phoneNumber = isValidPhone();
        String roomNumber = isValidRoom();
        int room = Integer.parseInt(roomNumber);
        System.out.println("Booking Date: ");
        LocalDate bookingDate = CheckInput.inputDate();
        
        System.out.print("Need airport pickup? (Y/N): ");
        String choice = scanner.nextLine();
        FlightInformation flightInfo = null;
        
        if (choice.equalsIgnoreCase("Y")) {
            System.out.print("Flight: ");
            String flightNumber = scanner.nextLine();
            System.out.print("Seat: ");
            String seatNumber = scanner.nextLine();
            System.out.println("Time pick up: ");
            LocalDateTime timePickUp = CheckInput.inputDateTime();
            if (timePickUp.toLocalDate().isBefore(bookingDate)) {
                System.out.println("Time pick up can not before the booking date");
                return;
            }
            flightInfo = new FlightInformation(flightNumber, seatNumber, timePickUp);
            
        }
        reservations.add(new Reservation(bookingID, customerName, phoneNumber, room, bookingDate, flightInfo));
        System.out.println("Add successfully.");
       
    }
    
    public void update() {
        System.out.println("Enter Booking ID to update: ");
        String id = CheckInput.inputString();
        Reservation res = null;
        
        for (Reservation r : reservations) {
            if (r.getBookingID().equalsIgnoreCase(id)) {
                res = r;
                break;
            }
        }
        
        if (res == null) {
            System.out.println("No reservation found!");
            return;
        }
        System.out.print("New Name: ");
        String name = scanner.nextLine();
        if (!name.isBlank()) {
            res.setCustomerName(name);
        }
        
        System.out.print("New Phone: ");
        String phone = scanner.nextLine();
        if (!phone.isBlank()) {
            res.setPhoneNumber(phone);
        }
        
        System.out.print("New Room: ");
        String room = scanner.nextLine();
        if (!room.isEmpty()) {
            res.setRoomNumber(Integer.parseInt(room));
        }
        
        System.out.print("New Booking Date: ");
        String date = scanner.nextLine();
        if (!date.isBlank()) {
            res.setDateTime(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }
        
        System.out.println("Updated successfully!");
    }
    
    public void deleteReservation() {
        System.out.print("Enter Booking ID to delete: ");
        String id = CheckInput.inputString();
        Reservation res = null;
        
        for (Reservation r : reservations) {
            if (r.getBookingID().equalsIgnoreCase(id)) {
                res = r;
                break;
            }
        }
        
        if (res == null) {
            System.out.println("No reservation found!");
            return;
        }
        
        System.out.print("Are you sure? (Y/N): ");
        if (scanner.nextLine().equalsIgnoreCase("Y")) {
            reservations.remove(res);
            System.out.println("Deleted successfully.");
        }
    }
    
    public void printAll() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations");
            return;
        } else {
            for (Reservation a : reservations) {
                System.out.println(a);
            }
        }
    }
    
    public void printFlight() {
        reservations.stream()
                .filter(r -> r.getFlightInformation() != null)
                .sorted(Comparator.comparing(r -> r.getFlightInformation().getTimePickUp()))
                .forEach(r -> System.out.println(r));
    }
}
