/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.exercise2.controller;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import week4.exercise1.view.CheckInput;
import week8.exercise2.model.EastAsiaCountries;

/**
 *
 * @author FPT
 */
public class ManageEastAsiaContries {

    ArrayList<EastAsiaCountries> eacountries = new ArrayList();

    public void addEAcountry() {
        System.out.println("-----Add East Asia Country---");
        while (true) {
            System.out.print("Enter code of country: ");
            String code = CheckInput.inputString();
            System.out.println("Enter name of country: ");
            String name = CheckInput.inputString();
            System.out.println("Enter total Area: ");
            float totalArea = CheckInput.InputFloat();
            System.out.println("Enter terrain of country: ");
            String terrain = CheckInput.inputString();

            try {
                eacountries.add(new EastAsiaCountries(terrain, code, name, totalArea));
                System.out.println("Add successfully!");

            } catch (Exception e) {
                System.out.println("Error when adding");
            }
            System.out.print("Do you want to add another country? (Y/N): ");
            String choice = CheckInput.inputString();
            if (choice.equalsIgnoreCase("N")) {
                break;
            }

        }
    }

    public void displayCountry(ArrayList<EastAsiaCountries> eacountries) {
        if (eacountries.isEmpty()) {
            System.out.println("List country is empty");
            return;
        }
        System.out.println("----DISPLAY SOUTH EAST ASIAN COUNTRY ------- ");
        System.out.printf("%5s %10s %10s %5s\n", "ID", "Country Name", "Total Area", "Terrain");
        for (EastAsiaCountries e : eacountries) {
            System.out.println(e);
        }
    }

    public void displayCountry() {
        displayCountry(this.eacountries);
    }

    public void searchCountry() {
        System.out.println("-----SEARCH BY USER-ENTERED NAME ---");
       
            System.out.println("Enter the name you want to search for: ");
            String name = CheckInput.inputString();
            boolean check = false;
            for (EastAsiaCountries e : eacountries) {
                if (e.getCountryName().equalsIgnoreCase(name)) {
                    System.out.println(e);
                    check = true;
                }
            }
            if(!check){
                System.out.println("Country name not found");
            }
        }
    

    public ArrayList<EastAsiaCountries> sortNamebyAscendingOrder() {
        return eacountries.stream()
                .sorted((a, b) -> a.getCountryName().compareTo(b.getCountryName()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
