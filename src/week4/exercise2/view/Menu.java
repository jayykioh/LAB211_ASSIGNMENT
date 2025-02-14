/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.exercise2.view;

import week4.exercise1.view.CheckInput;
import week4.exercise2.controller.PersonManagement;

/**
 *
 * @author FPT
 */
public class Menu {
    PersonManagement pm = new PersonManagement();
      public void showmenu() {
        while (true) {
            System.out.println("*** Information Management ***");
            System.out.println("1. Teacher");
            System.out.println("2. Student");
            System.out.println("3. Person");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = CheckInput.inputPositiveInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid option, pls try again");
                continue;
            }

            switch (choice) {
                case 1:
                    teachermenu();
                    break;
                case 2:
                    studentMenu();
                    break;
                case 3:
                    personMenu();
                    break;
                case 4:
                    return;
                default:
                    throw new AssertionError();
            }
        }
    }

    public void teachermenu() {
        while (true) {
            System.out.println("*** Teacher Management ***");
            System.out.println("1. Input");
            System.out.println("2. Print");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice1 = CheckInput.inputPositiveInt();
            if (choice1 < 1 || choice1 > 3) {
                System.out.println("Invalid option, pls try again");
                continue;
            }
            switch (choice1) {
                case 1:
                    pm.addteacher();
                    break;
                case 2:
                    pm.printteadcher();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public void studentMenu() {
        while (true) {
            System.out.println("*** Student Management ***");
            System.out.println("1. Add Student");
            System.out.println("2. Print Students");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = CheckInput.inputPositiveInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid option, please try again.");
                continue;
            }
            switch (choice) {
                case 1:
                    pm.addstudent();
                    break;
                case 2:
                    pm.printstudent();
                    break;
                case 3:
                    return;
            }
        }
    }

    private void personMenu() {
        while (true) {
            System.out.println("*** Person Management ***");
            System.out.println("1. Search");
            System.out.println("2. Print all");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = CheckInput.inputPositiveInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid option, please try again.");
                continue;
            }

            switch (choice) {
                case 1:
                    pm.searchperson();
                    break;
                case 2:
                    pm.printperson();
                    break;
                case 3:
                    return;
            }
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showmenu();
    }
}
