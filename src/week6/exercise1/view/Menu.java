/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.exercise1.view;

import week4.exercise1.view.CheckInput;
import week6.exercise1.controller.WorkerManagement;

/**
 *
 * @author FPT
 */
public class Menu {

    WorkerManagement wkk = new WorkerManagement();

    public void showmenu() {
        while (true) {

            System.out.println("======== Worker Management =========");
            System.out.println("1. Add Worker");
            System.out.println("2. Up salary");
            System.out.println("3. Down salary");
            System.out.println("4. Display Information salary");
            System.out.println("5. Exit");

            System.out.print("Your choice: ");
            int choice = CheckInput.inputPositiveInt();
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid options");
                return;
            }
            switch (choice) {
                case 1:
                    wkk.addWorker();
                    break;
                case 2:
                    wkk.increaseSalary();
                    break;
                case 3:
                    wkk.decreaseSalary();
                    break;
                case 4:
                    wkk.displaySalaryInfo();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid option, pls try again!");
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showmenu();

    }
}
