package com.company.excercise;

import java.util.Scanner;

public class findCharacter {
    public static void main(String[] args) {
        String characters= "return the amounts of number character in the string";
        Scanner sc=new Scanner(System.in);
        char node= 'n';
        int count= 0;
        for (int i=0;i<characters.length(); i++){
           if (node== characters.charAt(i)){
            count++;
           }
        }
        System.out.println(count);
    }
}

