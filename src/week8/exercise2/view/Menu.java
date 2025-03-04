/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.exercise2.view;

import week4.exercise1.view.CheckInput;
import week8.exercise2.controller.ManageEastAsiaContries;

/**
 *
 * @author FPT
 */
public class Menu {
    ManageEastAsiaContries meac = new ManageEastAsiaContries();
    public void showmenu(){
        while(true){
            
            System.out.println("==========================================================================");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of country you've just input");
            System.out.println("3. Search the information of country by user-entered name");
            System.out.println("4. Display the information of countries sorted name in ascending order");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = CheckInput.inputPositiveInt();
            if(choice < 1 || choice > 5){
                System.out.println("Invalid choice, try again");
                continue;
            }
            
            
            switch (choice) {
                case 1:
                    meac.addEAcountry();
                    break;
                case 2:
                    meac.displayCountry();
                    break;
                case 3:
                    meac.searchCountry();
                    break;
                case 4:
                    meac.displayCountry(meac.sortNamebyAscendingOrder());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showmenu();
    }
}
