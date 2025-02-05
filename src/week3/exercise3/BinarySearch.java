/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3.exercise3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class BinarySearch {

    private int n;
    private int arr[];

    public BinarySearch() {
    }

    public BinarySearch(int n) {
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
        for (int i = 0; i < this.n; i++) {
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

    public int checkInputInteger() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Must be double type, please try again ");
            }
        }
    }

    public void bubblesort() {
        if (isEmpty()) {
            System.out.println("Array is null");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public int binarysearch(int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                left = mid + 1;
            }
            if (arr[mid] > x) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public void menu() {
        System.out.println("Enter number of array: ");
        int n = checkInputInteger();
        System.out.println("Enter search value: ");
        int x = checkInputInteger();

        BinarySearch b = new BinarySearch(n);
        b.generatenumber();
        b.bubblesort();
        System.out.print("Sorted: ");
        b.display();
        int result = b.binarysearch(x);
        if (result > 0) {
            System.out.println("Found " + x + " at index: " + result);
        } else {
            System.out.println("Can not found");
        }
    }

}
