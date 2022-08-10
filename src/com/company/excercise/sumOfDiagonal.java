package com.company.excercise;

import java.util.Scanner;

public class sumOfDiagonal {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + "rows and " +
                matrix[0].length + "columns:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = sc.nextInt();
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
        int sum1= 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
            }
            sum1+= matrix[row][row];
        }
        System.out.println( "Sum of the first diagonal "+ sum1);
        int sum2= 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column =0; column <matrix[row].length; column++) {
                if((row+column)==(matrix[row].length-1)) {
                   sum2+=matrix[row][column];
                }
            }

        }
        System.out.println( "Sum of the first diagonal "+ sum2);
    }
    }


