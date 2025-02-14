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

    public void InputAll(Scanner sc) {
        while (true) {
            System.out.println("Enter ID(6 digits): ");
            int id = CheckInput.inputPositiveInt();
            if (isValidID(id)) {
                this.ID = id;
                break;
            } else {
                System.out.println("ID MUST BE 6 DIGITS");
                continue;
            }
        }
        while (true) {
            System.out.println("Enter full name: ");
            String name = CheckInput.inputString();
            if (isValidName(name)) {
                this.name = name;
                break;
            } else {
                System.out.println("NAME MUST BE ALPHABET AND BLANKS");
                continue;
            }
        }
        while (true) {
            System.out.println("Enter phone number: ");
            String phone = CheckInput.inputString();
            if (isValidPhone(phone)) {
                this.phonenumber = phone;
                break;
            } else {
                System.out.println("PHONE MUST BE 12 DIGITS");
            }
        }
        while (true) {
            System.out.println("Enter Year or Birth: ");
            int year = CheckInput.inputPositiveInt();
            if (isValidYear(year)) {
                this.yob = year;
                break;
            } else {
                System.out.println("YEAR OF BIRTH MUST BE BEFORE CURRENT YEAR");
            }
        }

        while (true) {
            System.out.println("Enter Major(No more than 30 characters): ");
            String major = CheckInput.inputString();
            if (isValidMajor(major)) {
                this.major = major;
                break;
            } else {
                System.out.println("MAJOR IS NO MORE THAN 30 CHARACTERS");
            }
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
