/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.exercise1.model;

/**
 *
 * @author FPT
 */
public class Tetrahedron extends ThreeDimensionalShape {

    private double side;

    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(side, 2);
    }

    @Override
    public double getVolume() {
        return (1.0 / 12.0) * Math.sqrt(2) * Math.pow(side, 3);
    }

    public Tetrahedron(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Tetrahedron\n" + "Side: " + side;
    }

}
