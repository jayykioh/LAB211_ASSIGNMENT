/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7.exercise1.model;

/**
 *
 * @author FPT
 */
public class OrderItem {

    private Fruit fruit;
    private int quantity;

    public OrderItem(Fruit fruit, int quantity) {
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public double totalPrice() {
        return quantity * fruit.getPrice();
    }
    
     public String toString() {
        return String.format("%s x%d - %.2f$ each - Total: %.2f$", fruit.getName(), quantity, fruit.getPrice(), totalPrice());
    }
}
