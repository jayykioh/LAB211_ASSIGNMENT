/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.exercise2;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class CalculatePerimeterArea {

    abstract class Shape {

        public abstract double perimeter();

        public abstract double area();

        public void printResult() {
            System.out.println("Permeter: " + perimeter());
            System.out.println("Area: " + area());
        }
    }

    public class Circle extends Shape {

        private double radius;

        @Override
        public double perimeter() {
            return (radius * Math.PI);
        }

        public Circle() {
        }

        @Override
        public double area() {
            return radius * radius * Math.PI;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public Circle(double radius) {
            this.radius = radius;
        }
        
        
    
    }

    public class Rectangle extends Shape {

        private double widthRec;
        private double lengthRec;

        @Override
        public double perimeter() {
            return (lengthRec + widthRec) * 2;
        }

        public double getWidthRec() {
            return widthRec;
        }

        public void setWidthRec(double widthRec) {
            this.widthRec = widthRec;
        }

        public double getLengthRec() {
            return lengthRec;
        }

        public Rectangle(double widthRec, double lengthRec) {
            this.widthRec = widthRec;
            this.lengthRec = lengthRec;
        }
        
         public void setLengthRec(double lengthRec) {
            this.lengthRec = lengthRec;
        }

        @Override
        public double area() {
            return lengthRec * widthRec;
        }
    }

    public class Triangle extends Shape {

        private double ATriangle;
        private double BTriangle;
        private double CTriangle;

        public Triangle(double ATriangle, double BTriangle, double CTriangle) {
            this.ATriangle = ATriangle;
            this.BTriangle = BTriangle;
            this.CTriangle = CTriangle;
        }
        
        @Override
        public double perimeter() {
            return ATriangle + BTriangle + CTriangle;
        }

        public double getATriangle() {
            return ATriangle;
        }

        public void setATriangle(double ATriangle) {
            this.ATriangle = ATriangle;
        }

        public double getBTriangle() {
            return BTriangle;
        }

        public void setBTriangle(double BTriangle) {
            this.BTriangle = BTriangle;
        }

        public double getCTriangle() {
            return CTriangle;
        }

        public void setCTriangle(double CTriangle) {
            this.CTriangle = CTriangle;
        }

        @Override
        public double area() {
            double result;
            double p = perimeter() / 2;
            result = Math.sqrt(p * (p - ATriangle) * (p - BTriangle) * (p - CTriangle));
            return result;
        }
    }

    Scanner sc = new Scanner(System.in);

    public double inputDouble() {
        while (true) {

            try {
                double input = Double.parseDouble(sc.nextLine());
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("Must be larger than 0");

                }
            } catch (NumberFormatException e) {
                System.out.println("Must be double, try again");
            }
        }
    }

    public void displayMenu() {
        System.out.println("=====Calculator Shape Program=====");
        System.out.println("Please input side width of Rectangle:");
        double sideRec = inputDouble();
        System.out.println("Please input length of Rectangle:");
        double lengthRec = inputDouble();
        System.out.println("Please input radius of Circle:");
        double r = inputDouble();
        System.out.println("Please input side A of Triangle:");
        double sideA = inputDouble();
        System.out.println("Please input side B of Triangle:");
        double sideB = inputDouble();
        System.out.println("Please input side C of Triangle:");
        double sideC = inputDouble();

        Rectangle rectangle = new Rectangle(sideA,lengthRec);
        Circle circle = new Circle(r);
        Triangle triangle = new Triangle(sideA, sideB, sideC);

        displayResult(rectangle, circle, triangle);
    }

    public void displayResult(Rectangle r, Circle c, Triangle t) {
        System.out.println("------Rectangle-------");
        System.out.printf("Width: %.2f\n", r.getWidthRec());
        System.out.printf("Length: %.2f\n", r.getLengthRec());
        r.printResult();
        System.out.println("-----Circle------");
        System.out.printf("Radius: %.2f\n", c.getRadius());
        c.printResult();

        System.out.println("-----Triangle--------");
        System.out.printf("Side A: %.2f\n", t.getATriangle());
        System.out.printf("Side B: %.2f\n", t.getBTriangle());
        System.out.printf("Side C: %.2f\n", t.getCTriangle());
        t.printResult();
    }

}
