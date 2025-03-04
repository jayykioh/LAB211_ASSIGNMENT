/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.exercise1.model;

/**
 *
 * @author FPT
 */
public class Triangle extends TwoDimensionalShape {

    private double sideA;
    private double sideB;
    private double sideC;

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.abs(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle\n"+"SideA: "+sideA+"\n"+"SideB: "+sideB+"\n"+"SideC: "+sideC+"\n";
    }
    
}
