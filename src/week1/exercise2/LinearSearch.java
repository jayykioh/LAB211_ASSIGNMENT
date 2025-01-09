/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author FPT
 */
public class LinearSearch {
    private int[] arr;
    int n;

    public LinearSearch() {
    }
    
    public LinearSearch(int n) {
         if (n <= 0) {
             throw new IllegalArgumentException("Array size must be larger than 0");
        }else{
              this.arr = new int[n];
         }
       
        this.n = n;
    }
 

    public void generateNumbers() {
        if (arr == null || n <= 0) {
            throw new IllegalArgumentException("Number must be larger than 0 ");
        }
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }
    }

    public void displayarray() {
        if(arr==null){
            System.out.println("Array is null");
        }
        System.out.print("The array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public ArrayList searchnumber(int x) {
        ArrayList<Integer> e = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                e.add(i);
            }
        }
        return e;
        }
}
