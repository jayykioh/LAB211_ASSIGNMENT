/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.exercise2.model;

import week4.exercise2.model.Person;
import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class Teacher extends Person {

    private int yearprofesion;
    private String contracttype;
    private double salarycoeff;

    public Teacher() {
        super();
        this.yearprofesion = 0;
        this.contracttype = "";
        this.salarycoeff = 0.0;
    }

    public int getYearprofesion() {
        return yearprofesion;
    }

    public String getContracttype() {
        return contracttype;
    }

    public double getSalarycoeff() {
        return salarycoeff;
    }

    @Override
   public  void InputAll(Scanner sc) {
        super.InputAll(sc); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        while (true) {
            System.out.println("Enter year in the profession: ");
            int year = sc.nextInt();
            if (year > 0 && year < (Year.now().getValue() - this.getYob())) {
                this.yearprofesion = year;
                break;
            } else {
                System.out.println("Year in the profession is number from 0 to lower than age");
            }
        }
        while (true) {
            System.out.println("Enter contract type: ");
            String c = sc.nextLine();
            if (c.equals("Short") || c.equals("Long")) {
                this.contracttype = c;
                break;
            } else {
                System.out.println("Contract type is Long or Short value");
            }
        }
        while (true) {
            System.out.println("Enter salary coefficient: ");
            double salary = sc.nextDouble();
            if (salary < 0) {
                System.out.println("Salary coefficient must be number from 0");
            } else {
                this.salarycoeff = salary;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s %-15d %-15s %-10.2f", super.toString(), yearprofesion, contracttype, salarycoeff);
    }

}
