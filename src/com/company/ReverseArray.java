package com.company;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        size= sc.nextInt();
        int[] array= new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter number in Array");
             array[i]=sc.nextInt();
        }
        for (int i=0; i< array.length;i++){
            System.out.println("psition" +i+"is"+array[i]);
        }
        for(int i=0; i< array.length/2; i++){
            int temp= array[i];
            array[i]= array[size-1-i];
            array[size-1-i]= temp;
        }
        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }

}
