/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.exercise2.view;

import week4.exercise1.view.CheckInput;
import week6.exercise2.controller.ContactManagement;

/**
 *
 * @author FPT
 */
public class Menu {

    ContactManagement cm = new ContactManagement();

    public void showmenu() {
        while (true) {

            System.out.println("========= Contact program =========");
            System.out.println("1. Add a Contact");
            System.out.println("2. Display all Contact");
            System.out.println("3. Delete a Contact");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = CheckInput.inputPositiveInt();
            if (choice < 1 || choice > 4) {
                System.out.println("invalid choice,try again");
            }
            switch (choice) {
                case 1:
                    cm.addContact();
                    break;
                case 2:
                    cm.display();
                    break;
                case 3:
                    cm.delete();
                    break;
                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid options");
            }
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showmenu();
    }
}
