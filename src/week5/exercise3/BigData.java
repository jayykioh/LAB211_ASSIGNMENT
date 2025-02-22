/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.exercise3;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class BigData {

    public static String addLargeNumber(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }
        return result.reverse().toString();
    }

    public static String mutiplyLargeNumber(String num1, String num2) {
        int[] result = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = temp + result[i + j + 1];
                result[i + j + 1] = temp % 10;
                result[i + j] += temp / 10;
            }
        }

        StringBuilder finalresult = new StringBuilder();
        for (int a : result) {
            if (!(finalresult.length() == 0 && a == 0)) {
                finalresult.append(a);
            }
        }
        return finalresult.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first large number: ");
        String num1 = scanner.nextLine();
        
        System.out.print("Enter second large number: ");
        String num2 = scanner.nextLine();
        
        String sum = addLargeNumber(num1, num2);
        String product = mutiplyLargeNumber(num1, num2);
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
