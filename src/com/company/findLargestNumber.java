package com.company;

import java.util.Scanner;

public class findLargestNumber {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter number in Array");
            array[i] = sc.nextInt();
        }

        int max=array[0];
        int pos = 0;
        for (int i=0; i< size; i++){
            if(array[i]>max){
                max= array[i];
                pos=i+1;
            }
        }
        System.out.println("The largest number in array is: "+ max+ "and position in "+ pos);

    }
}
