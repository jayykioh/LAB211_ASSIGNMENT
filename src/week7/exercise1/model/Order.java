/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7.exercise1.model;

import java.util.ArrayList;

/**
 *
 * @author FPT
 */
public class Order {
    private String customername;
    private ArrayList<OrderItem> orderItems;
    
    
     public Order(String customerName) {
        this.customername = customerName;
        this.orderItems = new ArrayList<>();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
     public void addItem(OrderItem item){
         orderItems.add(item);
     }
     public void displayOrder(){
         System.out.println("Customer Name: "+customername);
          System.out.println("Product    Quantity    Price   Amount");
          double totalprice = 0.0;
          for(OrderItem item : orderItems){
              System.out.println(item);
              totalprice += item.totalPrice();
          }
          System.out.println("Total: "+totalprice);
     }
     
     
     
     
     
}
