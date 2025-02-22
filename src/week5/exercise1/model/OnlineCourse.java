/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.exercise1.model;

/**
 *
 * @author FPT
 */
public class OnlineCourse extends Course {

    private String platforms;
    private String instructors;
    private String notes;

    public OnlineCourse() {
        super();
        this.platforms = "";
        this.instructors = "";
        this.notes = "";
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void InputAll(String id, int credit, String name, String platforms, String instructors, String notes) {
        super.InputAll(id, credit, name);
        setPlatforms(platforms);
        setInstructors(instructors);
        setNotes(notes);
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Platform: " + platforms + "\n"
                + "Instructor: " + instructors + "\n"
                + "Note: " + notes;

    }
}
