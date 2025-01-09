/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.exercise4;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate c = new Calculate();
        while (true) {
            System.out.println("\n=====EQUATION PROGRAM======");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            System.out.print("Please choice one option: ");
            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                continue;
            }

            switch (choice) {
                case 1:

                    System.out.print("Enter coefficient A: ");
                    float a = c.inputCheck(sc.nextLine());
                    System.out.print("Enter coefficient B: ");
                    float b = c.inputCheck(sc.nextLine());
                    Calculate cal = new Calculate(a, b);
                    List<Float> solution = cal.superlative();
                    if (solution == null) {
                        System.out.println("No solution.");
                    } else if (solution.isEmpty()) {
                        System.out.println("Infinitely many solutions.");
                    } else {
                        System.out.println("Solution: x = " + solution.get(0));
                    }
                    cal.displayNumberType();

                    break;
                case 2:
                    System.out.print("Enter coefficient A: ");
                    float a1 = c.inputCheck(sc.nextLine());
                    System.out.print("Enter coefficient B: ");
                    float b1 = c.inputCheck(sc.nextLine());
                    System.out.print("Enter coefficient C: ");
                    float c1 = c.inputCheck(sc.nextLine());
                    Calculate cal1 = new Calculate(a1, b1, c1);
                    List<Float> solutions = cal1.quadratic();
                    if (solutions == null) {
                        System.out.println("No solution.");
                    } else if (solutions.isEmpty()) {
                        System.out.println("Infinitely many solutions.");
                    } else {
                        System.out.println("Solutions:");
                        for (int i = 0; i < solutions.size(); i++) {
                            System.out.println("x" + (i + 1) + " = " + solutions.get(i));
                        }
                    }
                    
                    cal1.displayNumberType();
                break;  
                case 3:
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("Invalid option, pls try again");
                    break;
            }

        }

    }
}
