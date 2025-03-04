/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7.exercise1.view;

import week4.exercise1.view.CheckInput;
import week7.exercise1.controller.FruitShop;

/**
 *
 * @author FPT
 */
public class Menu {

    FruitShop fruitShop = new FruitShop();

    public void showmenu() {
        while (true) {
            System.out.println("\nFRUIT SHOP SYSTEM");
            System.out.println("1. Create Fruit");
            System.out.println("2. View Orders");
            System.out.println("3. Shopping");
            System.out.println("4. Exit");
            System.out.print("Please choose: ");
            int choice = CheckInput.inputPositiveInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid option");
                continue;
            }
            switch (choice) {
                case 1:
                    fruitShop.createFruit();
                    break;
                case 2:
                    fruitShop.viewOrder();
                    break;
                case 3:
                    fruitShop.shopping();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showmenu();

    }
}
