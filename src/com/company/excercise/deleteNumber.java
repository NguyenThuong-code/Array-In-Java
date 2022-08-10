package com.company.excercise;

import java.util.Scanner;

public class deleteNumber {
    public static void main(String[] args) {
        int[] arr= {2,4,5,6,7,9};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter position:");
        int pos = sc.nextInt();
        for (int i= 0; i<arr.length-1;i++){
                arr[pos-1] = arr[i + 1];
                   if(pos==i||i>pos){
                       arr[i] =arr[i+1];
                   }
            System.out.println(arr[i]);
        }
    }
}
