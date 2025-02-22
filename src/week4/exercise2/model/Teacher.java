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
    
    public void InputAll(int id, String name, String phone, int year, String major, int yearprofession, String c, double salary) {
        super.InputAll(id, name, phone, year, major);
        if (yearprofession > 0 && yearprofession < (Year.now().getValue() - this.getYob())) {
            this.yearprofesion = yearprofession;
        }
        if (c.equals("Short") || c.equals("Long")) {
            this.contracttype = c;
        }
        if (salary < 0) {
            System.out.println("Salary coefficient must be number from 0");
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s %-15d %-15s %-10.2f", super.toString(), yearprofesion, contracttype, salarycoeff);
    }
    
}
