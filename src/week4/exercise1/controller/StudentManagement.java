/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.exercise1.controller;

import week4.exercise1.model.Student;
import week4.exercise1.view.CheckInput;
import java.util.ArrayList;
import week4.exercise1.model.Report;

/**
 *
 * @author FPT
 */
public class StudentManagement {

    private ArrayList<Student> studentlist = new ArrayList<>();
    private ArrayList<Report> reportList = new ArrayList<>();

    public boolean isDuplicatedCourse(String id, String semester, String crs) {
        for (Student s : studentlist) {
            if (s.getId().equals(id) && s.getSemeter().equals(semester) && s.getCoursename().equals(crs)) {
                return true;
            }
        }
        return false;
    }

    public void addStudent() {

        while (true) {
            System.out.print("Input  student ID: ");
            String id = CheckInput.inputString();
            System.out.print("Input student name: ");
            String name = CheckInput.inputString();
            System.out.print("Input student semester:  ");
            String semester = CheckInput.inputString();
            String crs;
            while (true) {
                System.out.print("Input student courses: ");
                crs = CheckInput.inputCourse();
                if (isDuplicatedCourse(id, semester, crs)) {
                    System.out.println("Can not have same courses in same semester!");
                    continue;
                } else {
                    break;
                }

            }

            Student e = new Student(id, name, semester, crs);
            studentlist.add(e);

            if (studentlist.size() >= 3) {
                System.out.println("Do you want to continue adding?(Y/N): ");
                String choice = CheckInput.inputString();
                if (!choice.equalsIgnoreCase("Y")) {
                    break;
                }
            }
        }
    }

    public void findNsort() {
        System.out.println("Enter student name you want to find: ");
        String name = CheckInput.inputString();

        ArrayList<Student> foundStu = new ArrayList<>();
        for (Student e : studentlist) {
            if (e.getName().contains(name)) {
                foundStu.add(e);
            }
        }

        if (foundStu.isEmpty()) {
            System.out.println("There is no student with that name!");
            return;
        }

        foundStu.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Sorted Students ");
        System.out.format("%-15s%-15s%-15s%-15s\n", "ID", "Name", "Semester", "Course Name");
        for (Student e : foundStu) {
            System.out.println(e);
        }
    }

    public boolean uptdel() {
        System.out.print("Enter Student ID to search: ");
        String searchId = CheckInput.inputString();

        Student student = null;
        for (Student e : studentlist) {
            if (e.getId().equals(searchId)) {
                student = e;
                break;
            }
        }

        if (student == null) {
            System.out.println("No student match ID");
            return false;
        };

        System.out.println("Do you want to update or delete this student( (U) update or (D) delete ): ");
        String choice = CheckInput.inputString();
        if (choice.equalsIgnoreCase("U")) {
            System.out.print("Enter new Name: ");
            student.setName(CheckInput.inputString());
            System.out.print("Enter new Semester: ");
            student.setSemeter(CheckInput.inputString());
            System.out.print("Enter new Course Name: ");
            student.setCoursename(CheckInput.inputCourse());
            System.out.println("Student updated successfully.");
        } else if (choice.equalsIgnoreCase("D")) {
            studentlist.remove(student);
            System.out.println("Delete successfully!");
        } else {
            System.out.println("Invalid options");
        }
        return true;
    }

    public void genRepot() {
        for (Student e1 : studentlist) {
            int total = 0;
            for (Student e2 : studentlist) {
                if (e1.getId().equalsIgnoreCase(e2.getId()) && e1.getCoursename().equals(e2.getCoursename())) {
                    total++;
                }
            }

            if (!checkExistedReport(e1, reportList)) {
                reportList.add(new Report(e1.getName(), e1.getCoursename(), total));
            }
        }

        for (Report r : reportList) {
            System.out.println(r);
        }
    }

    public boolean checkExistedReport(Student e, ArrayList<Report> r) {
        for (Report report : r) {
            if (report.getStudentName().equalsIgnoreCase(e.getName()) && report.getCourseName().equalsIgnoreCase(e.getCoursename())) {
                return true;
            }
        }
        return false;
    }

}
