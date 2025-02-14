/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3.exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class BubbleSort {

    private int n;
    private int[] arr;

    public BubbleSort() {
    }

    public BubbleSort(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Array size must be larger than 0");
        }
        this.n = n;
        this.arr = new int[n];
    }

    public void generatenumber() {
        if (arr == null || n <= 0) {
            throw new IllegalArgumentException("Size must be larger than 0 ");
        }
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            arr[i] = rand.nextInt(n);
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

    public void bubblesort() {
        if (isEmpty()) {
            System.out.println("Array is null");
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
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

    public void menu() {
        System.out.println("Enter number of array: ");
        int n = checkInputInteger();
        BubbleSort b = new BubbleSort(n);
        b.generatenumber();
        System.out.print("Unsort array: ");
        b.display();
        b.bubblesort();
        System.out.print("Sorted array; ");
        b.display();
    }
}
