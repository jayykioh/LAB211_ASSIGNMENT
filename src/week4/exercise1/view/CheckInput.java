/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.exercise1.view;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class CheckInput {

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String result = scanner.nextLine();
            if (!result.isEmpty()) {
                return result;
            } else {
                System.out.println("Input must not be empty");
                System.out.println("Please input again: ");
            }
        }
    }

    public static String inputCourse() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String result = scanner.nextLine();
            if (!result.isEmpty()) {
                if (result.equalsIgnoreCase("Java") || result.equalsIgnoreCase(".Net") || result.equalsIgnoreCase("C/C++")) {
                    
                    
                    return result;
                } else {
                    System.out.println("Only 3 courses are ( Java, .Net, C/C++ ) , pls try again! ");
                }
            } else {
                System.out.println("Input must not be empty");
                System.out.println("Please input again: ");
            }
        }
    }

    public static int inputPositiveInt() {
        while (true) {
            try {
                int result = Integer.parseInt(inputString());
                if (result > 0) {
                    return result;
                } else {
                    System.out.println("Input must be a positive integer");
                    System.out.println("Please input again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer");
                System.out.println("Please input again: ");
            }
        }
    }
    
}
