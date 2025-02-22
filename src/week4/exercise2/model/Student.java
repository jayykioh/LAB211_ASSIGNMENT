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

    public void InputAll(int id, String name, String phone, int year, String major, int year2, int elscore) {
        super.InputAll(id, name, phone, year, major);
        if (year2 >= getYob() && year2 <= Year.now().getValue()) {
            this.yearadmission = year2;
        }
        if (elscore >= 0 && elscore <= 100) {
            this.englishscore = elscore;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %-15d %-10d", super.toString(), yearadmission, englishscore);
    }

}
