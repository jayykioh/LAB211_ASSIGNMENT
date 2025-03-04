/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7.exercise1.controller;

import java.util.ArrayList;
import java.util.Map;
import week4.exercise1.view.CheckInput;
import week7.exercise1.model.Fruit;
import week7.exercise1.model.Order;
import week7.exercise1.model.OrderItem;

/**
 *
 * @author FPT
 */
public class FruitShop {

    private ArrayList<Fruit> fruits = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();

    private static int nextID = 1;

public void createFruit() {
    while (true) {
        System.out.println("Enter Fruit Name: ");
        String name = CheckInput.inputString();
        System.out.println("Enter Price: ");
        double price = CheckInput.InputDouble();
        System.out.println("Enter Quantity: ");
        int quantity = CheckInput.inputPositiveInt();
        System.out.println("Enter Origin: ");
        String origin = CheckInput.inputString();

        fruits.add(new Fruit(nextID++, name, price, quantity, origin));
        System.out.println("Fruit added successfully!");

        while (true) {
            System.out.print("Do you want to continue adding fruits? (Y/N): ");
            String choice = CheckInput.inputString();
            if (choice.equalsIgnoreCase("N")) {
                return;  
            } else if (choice.equalsIgnoreCase("Y")) {
                break;  
            } else {
                System.out.println("Invalid input! Please enter 'Y' or 'N' ");
            }
        }
    }
}


    public void displayFruit() {
        if (fruits.isEmpty()) {
            System.out.println("No fruit available!");
            return;
        }

        System.out.println("\nList of Fruits:");
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public void shopping() {
        System.out.println("Enter customer name: ");
        String name = CheckInput.inputString();
        Order neworder = new Order(name);

        while (true) {
            displayFruit();
            System.out.println("Select item number to buy: ");
            int itemIndex = CheckInput.inputPositiveInt();
            if (itemIndex > fruits.size()) {
                System.out.println("Unavailable item number!");
                continue;
            }
            Fruit selectedfruit = fruits.get(itemIndex - 1);

            System.out.println("Successful select" + selectedfruit);
            System.out.println("Enter quantity: ");
            int quantity = CheckInput.inputPositiveInt();
            if (quantity > selectedfruit.getQuantity()) {
                System.out.println("out of stock!");
                continue;
            }
            neworder.addItem(new OrderItem(selectedfruit, quantity));

            selectedfruit.setQuantity(selectedfruit.getQuantity() - quantity);
            System.out.println("Do you want to order now (Y/N): ");
            String choice = CheckInput.inputString();
            if (choice.equalsIgnoreCase("Y")) {
                orders.add(neworder);
                System.out.println("ORDER SUCCESSFULLY");
                break;
            }
        }
    }

    public void viewOrder() {
        if (orders.isEmpty()) {
            System.out.println("Order is empty!");
            return;
        }
        System.out.println("\n----- Order List -----");
        for (Order order : orders) {
            order.displayOrder();
            System.out.println();
        }
    }
}
