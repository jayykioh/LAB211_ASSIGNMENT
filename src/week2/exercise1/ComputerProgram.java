/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.exercise1;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class ComputerProgram {

    Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputChoice();
        return choice;
    }

    public int checkInputChoice() {
        while (true) {
            try {
                int choice = Integer.parseInt(sc.nextLine().trim());
                if (choice < 1 || choice > 3) {
                    System.out.println("Invalid options. try again");
                    continue;
                } else {
                    return choice;
                }

            } catch (NumberFormatException e) {
                System.out.println("Please input number from 1 to 3, Try again");
            }
        }
    }

    public double checkInputDouble() {
        while (true) {
            try {
                double input = Double.parseDouble(sc.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Must be double type, please try again ");
            }
        }
    }

    public double checkPositiveDouble() {
        while (true) {
            double value = checkInputDouble();
            if (value <= 0) {
                System.out.println("Must be positive");
            } else {
                return value;
            }
        }
    }

    public void normalcaculator() {
        double res;
        System.out.print("Enter number: ");
        res = checkInputDouble();
        while (true) {
            System.out.println("Enter operation: ");
            String operation;

            while (true) {
                operation = sc.nextLine().trim();
                if (operation.isEmpty()) {
                    System.out.println("Can not be empty");
                } else {

                    Operations o = Operations.checkoperation(operation);
                    if (o != null) {
                        if (o == Operations.EQUALS) {
                            System.out.println("Memory: " + res);
                            return;
                        }

                        System.out.print("Enter number: ");
                        double input2 = checkInputDouble();
                        switch (o) {
                            case ADD:
                                res += input2;
                                break;
                            case MINUS:
                                res -= input2;
                                break;
                            case MULTIPLY:
                                res *= input2;
                                break;
                            case DIVIDE:
                                if (input2 == 0) {
                                    System.out.println("Cant divide by zero");
                                    continue;
                                }
                                res /= input2;
                                break;
                            case POWER:
                                res = Math.pow(res, input2);
                                break;
                        }
                        System.out.println("Memory: " + res);
                        break;

                    } else {
                        System.out.println("Please input +,-,*,/,^");
                    }
                }
            }
        }
    }

    public void BMIcalculator() {
        System.out.println("Enter Weight(kg): ");
        double weight = checkPositiveDouble();
        System.out.println("Enter Height(cm): ");
        double height = checkPositiveDouble();
        double bmi = (weight * 10000) / (height * height);
        System.out.printf("BMI number: %.2f\n", bmi);
        Bmistatuc(bmi);
    }

    public void Bmistatuc(double bmi) {
        if (bmi < 19) {
            System.out.println("Under-standard!");
        } else if (bmi >= 19 && bmi < 25) {
            System.out.println("Standard!");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight!");
        } else if (bmi >= 30 && bmi < 45) {
            System.out.println("Fat  shouble be lose weight! ");
        } else if (bmi >= 45) {
            System.out.println("Very Fat!");
        }
    }

}
