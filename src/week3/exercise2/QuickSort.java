/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3.exercise2;

import java.util.Random;
import java.util.Scanner;
import week3.exercise1.BubbleSort;

/**
 *
 * @author FPT
 */
public class QuickSort {

    private int n;
    private int arr[];

    public QuickSort() {
    }

    public QuickSort(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Size array must be larger than 0");
        }
        this.n = n;
        this.arr = new int[n];
    }

    public int partition(int low, int high) {
        int i = low;
        int j = low;
        int pivot = arr[high];
        while (i <= high) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }

public void quicksort(int low, int high) {
    if (low < high) {
        int p = partition(low, high); 
        quicksort(low, p - 1);        
        quicksort(p + 1, high);       
    }
}


    public boolean isEmpty() {
        return arr == null || arr.length == 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Array is null");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public int checkInputInteger() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Must be integer type, please try again ");
            }
        }
    }

    public void generatenumber() {
        if (arr == null || n <= 0) {
            throw new IllegalArgumentException("Size must be larger than 0 ");
        }
        for (int i = 0; i < this.n; i++) {
            Random rand = new Random();
            arr[i] = rand.nextInt(n);
        }
    }

    public void menu() {
        System.out.println("Enter number of array: ");
        int n = checkInputInteger();
        QuickSort b = new QuickSort(n);
        b.generatenumber();
        System.out.print("Unsort array: ");
        b.display();
        
        
        b.quicksort(0,b.arr.length - 1);
        System.out.print("Sorted array; ");
        b.display();
        
        
    }
}
