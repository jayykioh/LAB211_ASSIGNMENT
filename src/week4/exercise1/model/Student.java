/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.exercise1.model;

/**
 *
 * @author FPT
 */
public class Student {

    private String id;
    private String name;
    private String semeter;
    private String coursename;

    public Student() {
    }

    public Student(String id, String name, String semeter, String coursename) {
        this.id = id;
        this.name = name;
        this.semeter = semeter;
        this.coursename = coursename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemeter() {
        return semeter;
    }

    public void setSemeter(String semeter) {
        this.semeter = semeter;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15s%-15s", id, name, semeter, coursename);
    }

}
