/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.exercise1.view;

import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class CheckInput {

    static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    static DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mma");

    public static double InputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(inputString());
                if (result > 0) {
                    return result;
                } else {
                    System.out.println("Input must be a positive double");
                    System.out.println("Please input again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an double");
                System.out.println("Please input again: ");
            }
        }
    }
        public static float InputFloat() {
        while (true) {
            try {
                float result = Float.parseFloat(inputString());
                if (result > 0) {
                    return result;
                } else {
                    System.out.println("Input must be a positive float");
                    System.out.println("Please input again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an float");
                System.out.println("Please input again: ");
            }
        }
    }

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

    public static LocalDate inputDate() {
        while (true) {
            try {
                String input = inputString();
                return LocalDate.parse(input, DATE_FORMATTER);
            } catch (DateTimeException e) {
                System.out.println("Date must be in format dd-MM-yyyy");
                System.out.println("Please input again: ");
            }
        }
    }

    public static LocalDateTime inputDateTime() {
        while (true) {
            try {
                String input = inputString();
                return LocalDateTime.parse(input, DATETIME_FORMATTER);
            } catch (DateTimeException e) {
                System.out.println("Date must be in format dd-MM-yyyy hh:mma");
                System.out.println("Please input again: ");
            }
        }
    }

}
