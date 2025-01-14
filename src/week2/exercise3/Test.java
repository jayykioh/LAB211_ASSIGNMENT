/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.exercise3;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=====Calculator Program=====");
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            System.out.print("Your choice: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                continue;
            }

            Matrix matrix1 = new Matrix();
            Matrix matrix2 = new Matrix();
            Matrix result = null;

            switch (choice) {
                case 1:
                    System.out.println("------ Addition ------");
                    matrix1.inputMatrix(1);
                    matrix2.inputMatrix(2);
                    result = matrix1.addition(matrix2);
                    break;

                case 2:
                    System.out.println("------ Subtraction ------");
                     matrix1.inputMatrix(1);
                    matrix2.inputMatrix(2);
                    result = matrix1.subtraction(matrix2);
                    break;

                case 3:
                    System.out.println("------ Multiplication ------");
                     matrix1.inputMatrix(1);
                    matrix2.inputMatrix(2);
                    result = matrix1.multiplication(matrix2);
                    break;
                case 4:
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("Invalid options");
            }   

            if (result != null) {
                result.displaymatrix();
            }
        }

    }
}
