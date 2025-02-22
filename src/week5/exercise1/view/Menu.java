/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.exercise1.view;

import week4.exercise1.view.CheckInput;
import week5.exercise1.controller.CourseManagement;

/**
 *
 * @author FPT
 */
public class Menu {

    CourseManagement cm = new CourseManagement();

    public void menu() {
        while (true) {
            System.out.println("*** Course Management ***");
            System.out.println("1. Add online course/ offline course");
            System.out.println("2. Update course");
            System.out.println("3. Delete course");
            System.out.println("4. Print all / online course / offline course");
            System.out.println("5. Search information base on course name");
            System.out.println("6. Exit");
            System.out.println("You choose: ");
            int choice = CheckInput.inputPositiveInt();
            if (choice < 1 || choice > 6) {
                System.out.println("Invalid option, pls try again");
                continue;
            }
            switch (choice) {
                case 1:
                    cm.addCourse();
                    break;
                case 2:
                    cm.updateCrs();
                    break;
                case 3:
                    cm.deleteCourse();
                    break;
                case 4:
                    cm.showOffOnlCrs();
                    break;
                case 5:
                    cm.searchbycrsname();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
