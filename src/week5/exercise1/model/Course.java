/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.exercise1.model;

import java.util.ArrayList;

/**
 *
 * @author FPT
 */
public class Course {

    private String courseid;
    private int credits;
    private String coursename;

    public Course() {
        this.courseid = "";
        this.credits = 0;
        this.coursename = "";
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void InputAll(String id, int credit, String name) {
        setCourseid(id);
        setCoursename(name);
        setCredits(credit);
    }
//    public boolean isValid(String id,int credit, String name){
//        if(courseid.trim()==null){
//            return false;
//        }
//         if (name == null) {
//            return false;
//        }
//        if (credits <= 0) {
//            return false;
//        }
//    
//    }

    @Override
    public String toString() {
        return ("Course ID: " + courseid) + "\n" 
                + ("Course Name: " + coursename) + "\n" 
                + ("Credits: " + credits);
    }

}
