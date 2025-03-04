/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.exercise1.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

/**
 *
 * @author FPT
 */
public class SalaryInfo {

    DateTimeFormatter dateformatt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private String workerID;
    private String workerName;
    private int age;
    private double salarychanged;
    private String status;
    private LocalDate datechange;

    public SalaryInfo(String workerID, String workerName, int age, double salarychanged, String status, LocalDate datechange) {
        this.workerID = workerID;
        this.workerName = workerName;
        this.age = age;
        this.salarychanged = salarychanged;
        this.status = status;
        this.datechange = LocalDate.now();
    }

    public DateTimeFormatter getDateformatt() {
        return dateformatt;
    }

    public void setDateformatt(DateTimeFormatter dateformatt) {
        this.dateformatt = dateformatt;
    }

    public String getWorkerID() {
        return workerID;
    }

    public void setWorkerID(String workerID) {
        this.workerID = workerID;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalarychanged() {
        return salarychanged;
    }

    public void setSalarychanged(double salarychanged) {
        this.salarychanged = salarychanged;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDatechange() {
        return datechange;
    }

    public void setDatechange(LocalDate datechange) {
        this.datechange = datechange;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-10s %-5d %-10.2f %-6s %-10s%n", workerID, workerName, age, salarychanged, status, datechange.format(dateformatt));
    }

}
