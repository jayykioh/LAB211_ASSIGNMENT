/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.exercise1.view;

import java.util.Scanner;
import week4.exercise1.controller.StudentManagement;

/**
 *
 * @author FPT
 */
public class Menu {
    
  
    public void showMenu() {
        StudentManagement sm = new StudentManagement();
        while (true) {
            System.out.println("\n========== STUDENT MANAGEMENT SYSTEM ==========");
            System.out.println("1. Create Student");
            System.out.println("2. Find & Sort Student");
            System.out.println("3. Update/Delete Student");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    sm.addStudent();
                    break;
                case "2":
                    sm.findNsort();
                    break;
                case "3":
                    sm.uptdel();
                    break;
                case "4":
                    sm.genRepot();
                    break;
                case "5":
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }
    public static void main(String[] args) {
        Menu m = new Menu();
        m.showMenu();
    }
}
