/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3.exercise4;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class MyStack2 {

    private int length;
    private ListNode top;

    public class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void push(int x) {
        ListNode newnode = new ListNode(x);
        top.next = newnode;
        top = newnode;
        length++;
    }

    public int pop() {
        if (isEmpty()) {

        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    public int getIndex(int index) {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("index is out of array!");
        }
        ListNode current = top;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void displayStackTop() {
        // top - > bottom
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        ListNode current = top;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack2 stack2 = new MyStack2();
        stack2.push(4);
        stack2.push(5);
        stack2.push(7);
        stack2.push(10);
        stack2.push(22);
        stack2.displayStackTop();
        System.out.println("popping element: " + stack2.pop());
        System.out.println("Enter index: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = stack2.getIndex(n);
        System.out.println("Element at " + n + ": " + res);
    }

}
