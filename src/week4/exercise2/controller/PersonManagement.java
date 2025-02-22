/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.exercise2.controller;

import week4.exercise2.model.Teacher;
import week4.exercise2.model.Student;
import week4.exercise2.model.Person;
import java.awt.Choice;
import java.util.ArrayList;
import java.util.Scanner;
import week4.exercise1.view.CheckInput;

/**
 *
 * @author FPT
 */
public class PersonManagement {

    ArrayList<Teacher> teacherlist = new ArrayList<>();
    ArrayList<Student> studentlist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addstudent() {
        Student stu = new Student();
        System.out.print("Input ID(6 digits):  ");
        int id = CheckInput.inputPositiveInt();
        System.out.print("Input fullname: ");
        String fullname = CheckInput.inputString();
        System.out.print("Input phonenumber: ");
        String phonenumber = CheckInput.inputString();
        System.out.print("Input year of birth: ");
        int yob = CheckInput.inputPositiveInt();
        System.out.print("Input Major: ");
        String major = CheckInput.inputCourse();
        System.out.print("Input Year of Admisssion: ");
        int yearofadmission = CheckInput.inputPositiveInt();
        System.out.print("Input english score: ");
        int englishscore = CheckInput.inputPositiveInt();

        stu.InputAll(id, fullname, phonenumber, yob, major, yearofadmission, englishscore);
        studentlist.add(stu);
        System.out.println("Add successfully");
    }

    public void addteacher() {
        Teacher teacher = new Teacher();
        System.out.print("Input ID(6 digits):  ");
        int id = CheckInput.inputPositiveInt();
        System.out.print("Input fullname: ");
        String fullname = CheckInput.inputString();
        System.out.print("Input phonenumber: ");
        String phonenumber = CheckInput.inputString();
        System.out.print("Input year of birth: ");
        int yob = CheckInput.inputPositiveInt();
        System.out.print("Input Major: ");
        String major = CheckInput.inputCourse();
        System.out.print("Input Year of Profession: : ");
        int yearofprofession = CheckInput.inputPositiveInt();
        System.out.print("Input Contract type: ");
        String contract = CheckInput.inputString();
        System.out.print("Input salary coeff: ");
        double salary = CheckInput.InputDouble();
        teacher.InputAll(id, fullname, phonenumber, yob, major, yearofprofession, contract, salary);

        teacherlist.add(teacher);
        System.out.println("Add successfully");
    }

    public void printstudent() {
        if (studentlist.isEmpty()) {
            System.out.println("Student List is empty");
        } else {
            studentlist.sort((a, b) -> Integer.compare(a.getYearadmission(), b.getYearadmission()));
            System.out.printf("%-10s %-20s %-15s %-10s %-20s %-15s %-10s%n",
                    "ID", "Fullname", "Phone Number", "Year of Birth", "Major", "Year of Admission", "Eng Score");

            for (Student s : studentlist) {
                System.out.println(s);
            }
        }
    }

    public void printteadcher() {
        if (teacherlist.isEmpty()) {
            System.out.println("Teacher List is empty");
        } else {
            teacherlist.sort((a, b) -> Integer.compare(b.getYearprofesion(), a.getYearprofesion()));
            System.out.printf("%-10s %-20s %-15s %-10s %-20s %-15s %-15s %-10s%n",
                    "ID", "Fullname", "Phone Number", "Year of Birth", "Major", "Year in Profession", "Contract Type", "Salary Coeff.");
            for (Teacher t : teacherlist) {
                System.out.println(t);
            }
        }
    }

    public void searchperson() {
        System.out.println("Enter name of person you want to search: ");
        String name = CheckInput.inputString();
        ArrayList<Person> foundperson = new ArrayList<>();

        for (Student stu : studentlist) {
            if (stu.getName().contains(name)) {
                foundperson.add(stu);
            }
        }
        for (Teacher t : teacherlist) {
            if (t.getName().contains(name)) {
                foundperson.add(t);
            }
        }
        if (foundperson.isEmpty()) {
            System.out.println("Result: not found");
        } else {
            System.out.println("Result:\n"
                    + "# - ID - Fullname - Phone number - Year of birth - Major");
            for (Person p : foundperson) {
                System.out.println(p);
            }
        }
    }

    public void printperson() {
        ArrayList<Person> personlist = new ArrayList<>();
        personlist.addAll(studentlist);
        personlist.addAll(teacherlist);
        if (personlist.isEmpty()) {
            System.out.println("Person list is empty");
        } else {
            System.out.printf("%-10s %-20s %-15s %-10s %-20s%n",
                    "ID", "Fullname", "Phone Number", "Year of Birth", "Major");
            for (Person p : personlist) {
                System.out.println(p);
            }
        }
    }
}
