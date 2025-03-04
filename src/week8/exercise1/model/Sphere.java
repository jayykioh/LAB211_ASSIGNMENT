/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.exercise1.model;

/**
 *
 * @author FPT
 */
public class Sphere extends ThreeDimensionalShape {

    private double radius;

    @Override
    public double getArea() {
        return Math.PI * 4 * radius * radius;
    }

    @Override
    public double getVolume() {
        return Math.PI * (4 / 3) * Math.pow(radius, 3);
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

      @Override
    public String toString() {
        return "Sphere\n"+"Radius: "+radius; 
    }
    
}
