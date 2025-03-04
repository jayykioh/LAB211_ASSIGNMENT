/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.exercise2.controller;

import java.util.ArrayList;
import week4.exercise1.view.CheckInput;
import week6.exercise2.model.Contact;

/**
 *
 * @author FPT
 */
public class ContactManagement {

    ArrayList<Contact> contactlist = new ArrayList<>();
    public static int nextID = 1;

    public void addContact() {
        System.out.println("-------- Add a Contact --------");
        System.out.println("Enter name: ");
        String name = CheckInput.inputString();

        System.out.println("Enter Group: ");
        String group = CheckInput.inputString();
        System.out.println("Enter Address: ");
        String address = CheckInput.inputString();
        String phone;
        while (true) {
            try {
                System.out.println("Enter Phone: ");
                phone = CheckInput.inputString();
                if (!Contact.Validphone(phone)) {
                    System.out.println("Please input Phone flow\n"
                            + " 1234567890\n"
                            + " 123-456-7890\n"
                            + " 123-456-7890 x1234\n"
                            + " 123-456-7890 ext1234\n"
                            + " 123.456.7890\n"
                            + " 123 456 7890");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error when adding phone number!");
            }
        }
        Contact newcontact = new Contact(nextID++, name, group, address, phone);
        contactlist.add(newcontact);
        System.out.println("Add successfully!");
    }

    public void display() {
        if (contactlist.isEmpty()) {
            System.out.println("Contact List is empty!");
        } else {
            System.out.println("--------------------------------- Display all Contact ----------------------------");
            System.out.printf("%-4s %-20s %-12s %-15s %-10s %-15s\n", "ID", "Full Name", "First Name", "Last  Name", "Group", "Phone");
            for (Contact c : contactlist) {
                System.out.println(c);
            }
        }
    }

    public void delete() {
        System.out.println("------- Delete a Contact -------");
        System.out.print("Enter ID: ");
        int id = CheckInput.inputPositiveInt();
        Contact delcontact = null;

        for (Contact c : contactlist) {
            if (c.getId() == id) {
                delcontact = c;
                break;
            }
        }
        if (delcontact != null) {
            System.out.println("Contact found,do you want to delete!(Y/N):  ");
            String choice = CheckInput.inputString();
            if (choice.equalsIgnoreCase("Y")) {
                contactlist.remove(delcontact);
                System.out.println("Delete successfully");
            } else {
                System.out.println("Delete canceled");
            }
        } else {
            System.out.println("Can not found contact!");
        }

    }
}
