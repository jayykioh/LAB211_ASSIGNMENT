/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.exercise1;

/**
 *
 * @author FPT
 */
public class Test {
    public static void main(String[] args) {
            while(true){
                ComputerProgram cp = new ComputerProgram();
                int choice = cp.menu();
                switch (choice) {
                    case 1:
                        cp.normalcaculator();
                        break;
                    case 2:
                        cp.BMIcalculator();
                        break;
                    case 3:
                        System.out.println("Exiting");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option, try again: ");
                        
                }
            }
    }
}
