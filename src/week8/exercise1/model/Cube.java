/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.exercise1.model;

/**
 *
 * @author FPT
 */
public class Cube extends ThreeDimensionalShape {

    private double a;

    @Override
    public double getArea() {
        return 6 * a * a;
    }

    public double getVolume() {
        return Math.pow(a, 3);
    }

    public Cube(double a) {
        this.a = a;
    }
    public String getName(){
        return "Cube";
    }
        @Override
    public String toString() {
        return "Cube\n"+"Side: "+a; 
    }
}
