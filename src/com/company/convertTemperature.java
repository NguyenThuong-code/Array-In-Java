package com.company;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class convertTemperature {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Fahreheit to Celsius");
            System.out.println("2. Celsius to Fahreheit");
            System.out.println("0. Exit");
            System.out.println("plesae choice the number:");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenhei:");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius:" + fahrenheitToCelsius(fahrenheit));
                    break;

                case 2:
                    System.out.println("Enter Celsius");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit" + celsiusToFahrenheit(celsius));
                    break;

                case 0:
                    System.exit(0);
                    break;
            }

        }
        while(choice!=0);

    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit =(9.0/5)* celsius+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius=(5.0/9)*(fahrenheit-32);
        return celsius;
    }

    }

