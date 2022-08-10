package com.company.excercise;

import java.util.Scanner;

public class sumOfColumns {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter column want to calculate:");
        int number = sc.nextInt();
        System.out.println("Enter " + matrix.length + "rows and " +
                matrix[0].length + "columns:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = sc.nextInt();
            }
        }
        int sum= 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
            }
           sum+= matrix[row][number-1];
            }
        System.out.println(sum);
    }
}
