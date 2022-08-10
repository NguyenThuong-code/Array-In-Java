package com.company.excercise;

import java.util.Scanner;

public class LargestNumberInMultiArr {
    public static void main(String[] args) {
        int[][] matrix= new int[3][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+ matrix.length+"rows and " +
                matrix[0].length+ "columns:");
        for(int row=0; row<matrix.length;row++){
            for(int column=0; column<matrix[row].length;column++){
                matrix[row][column]= sc.nextInt();
            }
        }
        int max= matrix[0][0];
        for(int row=0; row<matrix.length;row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column]>max){
                    max= matrix[row][column];
                }
            }
        }
        System.out.println("The largest number in Array"+ max);
            }
    }

