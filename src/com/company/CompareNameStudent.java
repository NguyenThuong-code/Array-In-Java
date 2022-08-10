package com.company;

import java.util.Scanner;

public class CompareNameStudent {

    public static void main(String[] args) {
        String[] nameStudent= {"Hai", "Linh", "Thuong", "Tung"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name to check!");
        String name= scanner.nextLine();
boolean isExist=false;
        for(int i=0; i< nameStudent.length;i++){
            if(name.equalsIgnoreCase(nameStudent[i])){
                System.out.println("The position of Name is "+i);
                isExist=true;
            }
        }
        if (!isExist){
            System.out.println("Not found the name in the List");
        }

    }


}
