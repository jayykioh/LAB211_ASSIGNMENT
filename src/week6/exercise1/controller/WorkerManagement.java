/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.exercise1.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import week4.exercise1.view.CheckInput;
import week6.exercise1.model.SalaryInfo;
import week6.exercise1.model.Worker;

/**
 *
 * @author FPT
 */
public class WorkerManagement {

    ArrayList<Worker> workerlist = new ArrayList<>();
    ArrayList<SalaryInfo> salarylist = new ArrayList<>();

    public boolean isExistID(String id) {
        for (Worker w : workerlist) {
            if (w.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public void addWorker() {
        System.out.println("***Add worker****");
        String id;
        while (true) {
            System.out.print("Enter ID's worker: ");
            id = CheckInput.inputString();
            if (isExistID(id)) {
                System.out.println("ID can not be duplicated, try again!");
                continue;
            } else {
                break;
            }
        }
        System.out.print("Enter worker name: ");
        String name = CheckInput.inputString();
        int age = 0;
        while (true) {
            System.out.print("Enter age worker(18-50): ");
            age = CheckInput.inputPositiveInt();
            if (age >= 18 && age <= 50) {
                break;
            } else {
                System.out.println("Age must be between 18 and 50, try again!");
            }
        }
        System.out.print("Enter salary's worker: ");
        double salary = CheckInput.InputDouble();
        System.out.print("Enter worker work location: ");
        String worklocation = CheckInput.inputString();

        try {
            workerlist.add(new Worker(id, name, age, salary, worklocation));
            System.out.println("Add successfully!");
        } catch (Exception e) {
            System.out.println("Error when adding");
        }
    }

    public void increaseSalary() {
        System.out.println("****Up Salary****");
        System.out.print("Enter ID's worker to check: ");
        String id = CheckInput.inputString();
        if (!isExistID(id)) {
            System.out.println("Id is not found!");
            return;
        }
        Worker temp = null;
        for (Worker e : workerlist) {
            if (e.getId().equalsIgnoreCase(id)) {
                temp = e;
                break;
            }
        }

        try {
            System.out.println("Enter up salary: ");
            double upsalary = CheckInput.InputDouble();

            double newsalary = upsalary + temp.getSalary();
            temp.setSalary(newsalary);
            System.out.println("New salary after up: " + newsalary);
        } catch (Exception e) {
            System.out.println("Error when up salary!");
        }

        SalaryInfo s1 = new SalaryInfo(temp.getId(), temp.getName(), temp.getAge(), temp.getSalary(), "UP", LocalDate.now());
        salarylist.add(s1);
        
    }
     public void decreaseSalary() {
         System.out.println("****Down Salary****");
        System.out.print("Enter ID's worker to check: ");
        String id = CheckInput.inputString();
        if (!isExistID(id)) {
            System.out.println("Id is not found!");
            return;
        }
        Worker temp = null;
        for (Worker e : workerlist) {
            if (e.getId().equalsIgnoreCase(id)) {
                temp = e;
                break;
            }
        }

        try {
            System.out.println("Enter down salary: ");
            double downsalary = CheckInput.InputDouble();

            double newsalary =  temp.getSalary() - downsalary;
            temp.setSalary(newsalary);
            System.out.println("New salary after down: " + newsalary);
        } catch (Exception e) {
            System.out.println("Error when up salary!");
        }

        SalaryInfo s1 = new SalaryInfo(temp.getId(), temp.getName(), temp.getAge(), temp.getSalary(), "DOWN", LocalDate.now());
        salarylist.add(s1);
    }  
     public void displaySalaryInfo(){
         if(salarylist.isEmpty()){
             System.out.println("Infomartion Salary list is empty!");
             return;
         }
         System.out.println("******Display Information Salary*****");
         System.out.printf("%-5s %-10s %-5s %-10s %-6s %-10s%n","Code","Name","Age","Salary","Status","Date");
         for(SalaryInfo si : salarylist){
             System.out.println(si);
         }
     }
    
   

}
