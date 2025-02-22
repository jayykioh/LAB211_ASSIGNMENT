/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.exercise2.view;

import java.util.Scanner;
import week5.exercise2.controller.ReservationManagement;

/**
 *
 * @author FPT
 */
public class Menu {
    ReservationManagement rm = new ReservationManagement();
    Scanner scanner = new Scanner(System.in);
    public void menu(){
        while(true){
            System.out.println("\n*** Reservation Management ***");
            System.out.println("1. Create new reservation");
            System.out.println("2. Update reservation");
            System.out.println("3. Delete reservation");
            System.out.println("4. Print Flight Information");
            System.out.println("5. Print all reservations");
            System.out.println("6. Exit");
            System.out.print("You choose: ");
              int choice = scanner.nextInt();
            scanner.nextLine();
            
            
            
            switch (choice) {
                case 1: rm.createReservation(); break;
                case 2: rm.update(); break;
                case 3: rm.deleteReservation(); break;
                case 4: rm.printFlight(); break;
                case 5: rm.printAll(); break;
                case 6: System.out.println("Exiting......"); return;
                default: System.out.println("Invalid choice! Please enter again.");
            }
        }
        }
    
    
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();
    }
    }

