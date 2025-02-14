/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.exercise2.model;

import week4.exercise2.model.Person;
import java.time.Year;
import java.util.Scanner;
import week4.exercise1.view.CheckInput;

/**
 *
 * @author FPT
 */
public class Student extends Person {

    private int yearadmission;
    private int englishscore;

    public Student() {
        super();
        this.yearadmission = 0;
        this.yearadmission = 0;
    }

    public int getYearadmission() {
        return yearadmission;
    }

    public int getEnglishscore() {
        return englishscore;
    }

    @Override
    public void InputAll(Scanner sc) {
        super.InputAll(sc);
        while (true) {
            System.out.println("Enter year of admission: ");
            int year = CheckInput.inputPositiveInt();
            if (year >= getYob() && year <= Year.now().getValue()) {
                this.yearadmission = year;
                break;
            } else {
                System.out.println("Year of admission must be between birth year and current year");
            }
        }
        while (true) {
            System.out.println("Enter Entrance English Score: ");
            int elscore = CheckInput.inputPositiveInt();
            if (elscore >= 0 && elscore <= 100) {
                this.englishscore = elscore;
                break;
            } else {
                System.out.println("Entrance English score must be from 0 to 100");
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s %-15d %-10d", super.toString(), yearadmission, englishscore);
    }

}
