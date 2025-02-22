/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.exercise2.model;

import java.time.Year;
import java.util.Scanner;
import java.util.regex.Pattern;
import week4.exercise1.view.CheckInput;

/**
 *
 * @author FPT
 */
public class Person {

    private int ID;
    private String name;
    private String phonenumber;
    private int yob;
    private String major;

    public Person(int ID, String name, String phonenumber, int yob, String major) {
        this.ID = ID;
        this.name = name;
        this.phonenumber = phonenumber;
        this.yob = yob;
        this.major = major;
    }

    public Person() {
        this.ID = 0;
        this.name = "";
        this.phonenumber = "";
        this.major = "";
        this.yob = 0;
    }

    boolean isValidID(int ID) {
        return Pattern.matches("\\d{6}", String.valueOf(ID));
    }

    boolean isValidName(String name) {
        return Pattern.matches("[a-zA-Z ]+", name);
    }

    boolean isValidPhone(String phone) {
        return Pattern.matches("\\d{12}$", phone);
    }

    boolean isValidYear(int year) {
        return year < Year.now().getValue();
    }

    boolean isValidMajor(String major) {
        return major.length() < 30;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void InputAll(int id, String name, String phone, int year, String major) {
        if (isValidID(id)) {
            this.ID = id;
        }
        if (isValidName(name)) {
            this.name = name;
        }
        if (isValidPhone(phone)) {
            this.phonenumber = phone;

        }
        if (isValidYear(year)) {
            this.yob = year;
        }
        if (isValidMajor(major)) {
            this.major = major;
        }
    }

    @Override
    public String toString() {
        return String.format("%-10d %-20s %-15s %-18d %-25s",
                ID, name, phonenumber, yob, major);
    }

    public String getperson() {
        return super.toString();
    }
}
