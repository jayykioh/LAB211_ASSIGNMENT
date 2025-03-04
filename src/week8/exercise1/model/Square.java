/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.exercise1.model;

/**
 *
 * @author FPT
 */
public class Square extends TwoDimensionalShape {
    private double side;
    @Override
    public double getArea() {
        return side*4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square\n"+"Side: "+getSide();
           }
    
    
    
}
