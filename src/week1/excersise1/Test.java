/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.excersise1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class Test {
 public void test(){
     System.out.println("Enter your string: ");
     Scanner sc = new Scanner(System.in);
     String input = sc.nextLine();
     
     
     LetterandCharacterCount l = new LetterandCharacterCount(input);
     HashMap<String,Integer> countword = l.countwords();
     System.out.println(countword);
     
     HashMap<Character,Integer> countletter = l.countletter();
     System.out.println(countletter);
     
 }   
    public static void main(String[] args) {
        Test t = new Test();
        t.test();
    }
}
