/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class Test {
    
   public void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        System.out.println("Enter search number");
        int key = sc.nextInt();
 
        LinearSearch ln = new LinearSearch(n);
        ln.generateNumbers();
        ln.displayarray();
        
        
        ArrayList<Integer> e = ln.searchnumber(key);
        if(e.isEmpty()){
            System.out.println("Number is not found");
        }else{
            for(int number : e){
                System.out.println("Number "+key+" found at: "+number);
            }
            System.out.println();
        }
    }
   
    public static void main(String[] args) {
        Test t = new Test();
        t.test();
    }
}
