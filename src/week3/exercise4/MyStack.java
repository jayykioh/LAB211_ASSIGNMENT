/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3.exercise4;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author FPT
 */
public class MyStack {

    Stack<Integer> stack = new Stack<>();
    private int stackvalues;

    public MyStack() {
    }

    public MyStack(int stackvalues) {
        this.stackvalues = stackvalues;
    }

    public void push(int stackvalue) {
        stack.push(stackvalue);
    }

    public void pop() {
        System.out.println(stack.pop());
    }

    public void get(int index) {
        if (index < 0 || index >= stack.size()) {
            System.out.println("Index is out of bounds!");
            return;
        }
        System.out.println("Element at index " + index + ": " + stack.get(index));
    }

    public void displayStack() {
        for (int x : stack) {
            System.out.print(x + "-->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.displayStack();
        System.out.print("Pop stack: ");
        stack.pop();
        System.out.println("Enter index to get value: ");;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        stack.get(n);
    }
}
