/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.exercise4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FPT
 */
public class Calculate {

    private float a;
    private float b;
    private float c;

    public Calculate() {
    }

    public Calculate(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Calculate(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float inputCheck(String input) {
        while (true) {
            try {
                return Float.parseFloat(input);

            } catch (NumberFormatException e) {
                System.out.println("Input must be an float");
                System.out.println("Please input again: ");
            }
        }
    }

    public boolean isOdd(float n) {
        return n % 2 != 0;
    }

    public boolean isSquare(float n) {
        if (n <= 0) {
            return false;
        }

        double sqrt = Math.sqrt(n);
        return (sqrt * sqrt == n);
    }

    public List<Float> superlative() {
        if (a == 0) {
            if (b == 0) {
                return new ArrayList<>();
            } else {
                return null;
            }
        } else {

            List<Float> list = new ArrayList<>();
            list.add(-b / a);
            return list;
        }
    }

    public List<Float> quadratic() {
        if (a == 0) {
            return new Calculate(b, c).superlative();
        }

        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            return null;
        } else if (delta == 0) {
            List<Float> result = new ArrayList<>();
            result.add(-b / (2 * a));
            return result;
        } else {
            List<Float> result = new ArrayList<>();
            result.add((-b + (float) Math.sqrt(delta)) / (2 * a));
            result.add((-b - (float) Math.sqrt(delta)) / (2 * a));
            return result;

        }
    }

//    public void displayNumberType() {
//        float[] arr = {a, b, c};
//        for (float a : arr) {
//            if (isOdd(a)) {
//                System.out.println(a + " is odd");
//            } else {
//                System.out.println(a + " is even");
//            }
//
//            if (isSquare(a)) {
//                System.out.println(a + " is a perfect square");
//            }
//        }
//    }
    public void displayNumberType() {
        float[] coefficients = {a, b, c};
        List<Float> oddNumbers = new ArrayList<>();
        List<Float> evenNumbers = new ArrayList<>();
        List<Float> perfectSquares = new ArrayList<>();

        for (float coef : coefficients) {
            if (coef != 0) {
                if (isOdd(coef)) {
                    oddNumbers.add(coef);
                } else {
                    evenNumbers.add(coef);
                }

                if (isSquare(coef)) {
                    perfectSquares.add(coef);
                }
            }
        }

        if (!oddNumbers.isEmpty()) {
            System.out.print("Number is odd:");
            for (float num : oddNumbers) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }

        if (!evenNumbers.isEmpty()) {
            System.out.print("Number is Even:");
            for (float num : evenNumbers) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }

        if (!perfectSquares.isEmpty()) {
            System.out.print("Number is Perfect Square:");
            for (float num : perfectSquares) {
                System.out.print(num + ", ");
            }
        }

    }
}
