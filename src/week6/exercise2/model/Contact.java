/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.exercise2.model;

/**
 *
 * @author FPT
 */
public class Contact {

    private int id;
    private String fullname;
    private String group;
    private String address;
    private String lastname;
    private String firstname;
    private String phone;

    public Contact(int id, String fullname, String group, String address, String phone) {
        this.id = id;
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;

        String[] names = fullname.split(" ", 2);
        this.firstname = names[0];
        this.lastname = names[1];
    }

    @Override
    public String toString() {
        return String.format("%-4d %-20s %-12s %-15s %-10s %-15s\n", id, fullname, firstname, lastname, group, phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static boolean Validphone(String phone) {
        String regex = "^(\\d{10}|\\d{3}[- .]\\d{3}[- .]\\d{4}( (x|ext)\\d{4})?)$";
        return phone.matches(regex);
    }


    
    
}
