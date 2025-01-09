/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.exercise3;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int inputBase;
            int outputBase;
            while (true) {
                try {
                    System.out.print("Choose the input base system:  ");
                    System.out.println("1. Binary ");
                    System.out.println("2. Decimal ");
                    System.out.println("3. Hexadecimal ");
                    System.out.print("Enter your choice: ");
                    inputBase = scanner.nextInt();
                    scanner.nextLine();

                    if (inputBase >= 1 && inputBase <= 3) {
                        break;
                    } else {
                        System.out.println("Invalid choice.");
                    }
                } catch (Exception e) {
                    System.out.println("Pls enter a number 1-3");
                    scanner.nextLine();
                }
            }
            System.out.print("\nEnter the value to be converted: ");
            String inputValue = scanner.next();
            String result = "";
            ChangeBaseSystem converter = new ChangeBaseSystem(inputValue);

            System.out.println("Choose the output base system:   ");
            System.out.println("1. Binary (2)");
            System.out.println("2. Decimal (10)");
            System.out.println("3. Hexadecimal (16)");
            System.out.print("Enter your choice: ");
            outputBase = scanner.nextInt();
            scanner.nextLine();
            try {
                if (inputBase == 1 && outputBase == 2) {
                    result = String.valueOf(converter.bitodec());

                } else if (inputBase == 1 && outputBase == 3) {
                    result = converter.bittohex();

                } else if (inputBase == 2 && outputBase == 1) {
                    result = converter.dectobi();

                } else if (inputBase == 2 && outputBase == 3) {
                    result = converter.dectohex();

                } else if (inputBase == 3 && outputBase == 1) {
                    result = converter.hextobi();

                } else if (inputBase == 3 && outputBase == 2) {
                    result = String.valueOf(converter.hextodec());

                } else if (inputBase == outputBase) {
                    result = inputValue;
                } else {
                    System.out.println("Invalid choice");
                    continue;
                }
                System.out.println("Converted value: " + result);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Do you want to continue(Y/N): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("N")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
        }
    }
}
