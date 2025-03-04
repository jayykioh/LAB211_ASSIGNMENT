/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.exercise1.controller;

import week8.exercise1.model.Circle;
import week8.exercise1.model.Cube;
import week8.exercise1.model.Shape;
import week8.exercise1.model.Sphere;
import week8.exercise1.model.Square;
import week8.exercise1.model.Tetrahedron;
import week8.exercise1.model.ThreeDimensionalShape;
import week8.exercise1.model.Triangle;
import week8.exercise1.model.TwoDimensionalShape;

/**
 *
 * @author FPT
 */
public class ShapeController {

    public void printShape(Shape[] shapes) {
        for (Shape s : shapes) {
            if (s instanceof TwoDimensionalShape) {
                System.out.println("Type: 2-dimensional shapes");
                System.out.println(s);
                System.out.printf("Area: %.2f\n", ((TwoDimensionalShape) s).getArea());
            } else if (s instanceof ThreeDimensionalShape) {
                System.out.println("Type: 3-dimensional shapes");
                System.out.println(s);
                System.out.printf("Area: %.2f\n", s.getArea());
                System.out.printf("Volume: %.2f\n", ((ThreeDimensionalShape) s).getVolume());
            }
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
            new Circle(4),
            new Cube(7),
            new Sphere(2.5),
            new Square(3.6),
            new Tetrahedron(4.5),
            new Triangle(3, 4, 5),};

        ShapeController sc = new ShapeController();
        sc.printShape(shapes);
    }
}
