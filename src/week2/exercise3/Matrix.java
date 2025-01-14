/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.exercise3;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class Matrix {

    private int row;
    private int column;
    int matrix[][];

    public Matrix() {
    }

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
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

    public void inputMatrix(int a) {
        System.out.println("Enter Row: ");
        this.row = checkInputInteger();
        System.out.println("Enter Column: ");
        this.column = checkInputInteger();
       

        this.matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Enter Matrix%d : [%d][%d]: ", a, i, j);
                this.matrix[i][j] = checkInputInteger();
            }
        }
    }

    public void displaymatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

    public Matrix addition(Matrix other) {

        if (this.row != other.getRow() || this.column != other.getColumn()) {
            System.out.println("2 matrix must have same size!");
            return null;
        } else {
            this.displaymatrix();
            System.out.println("+");
            other.displaymatrix();
            System.out.println("=");
            Matrix matrix3 = new Matrix(row, column);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    matrix3.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
                }
            }
            return matrix3;
        }
    }

    public Matrix subtraction(Matrix other) {

        if (this.row != other.getRow() || this.column != other.getColumn()) {
            System.out.println("2 matrix must have same size!");
            return null;
        } else {
            displaymatrix();
            System.out.println("-");
            other.displaymatrix();
            System.out.println("=");
            Matrix matrix3 = new Matrix(row, column);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    matrix3.matrix[i][j] = this.matrix[i][j] - other.matrix[i][j];
                }
            }
            return matrix3;
        }
    }

    public Matrix multiplication(Matrix other) {

        if (this.column != other.getRow()) {
            System.out.println("First matrix's column must be equal row of second matrix");
            return null;
        } else {
            displaymatrix();
            System.out.println("*");
            other.displaymatrix();
            System.out.println("=");
            Matrix result = new Matrix(this.row, other.getColumn());
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < other.getColumn(); j++) {
                    result.matrix[i][j] = 0;
                    for (int k = 0; k < this.column; k++) {
                        result.matrix[i][j] += this.matrix[i][k] * other.matrix[k][j];
                    }
                }
            }
            return result;
        }
    }

}
