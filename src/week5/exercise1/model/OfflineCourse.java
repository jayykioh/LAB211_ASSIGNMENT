/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.exercise1.model;

import java.time.LocalDate;

/**
 *
 * @author FPT
 */
public class OfflineCourse extends Course {

    private LocalDate begin;
    private LocalDate end;
    private String campus;

    public OfflineCourse() {
        super();
        this.campus = "";
    }

    public void InputAll(String id, int credit, String name, LocalDate begin, LocalDate end, String campus) {
        super.InputAll(id, credit, name);
        setBegin(begin);
        setEnd(end);
        setCampus(campus);
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Begin: " + begin + "\n"
                + "End: " + end + "\n"
                + "Campus: " + campus;

    }

}
