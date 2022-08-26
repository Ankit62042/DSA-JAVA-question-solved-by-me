package com.ankit;

import java.util.Scanner;

public class LeapYear {


    static void isLeapYear(int Year) {

        if (Year % 4 == 0 && Year % 100 == 0 && Year % 400 == 0){
            System.out.println(Year + " Is a Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }



    }



    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Year");


        int year= input.nextInt();

        isLeapYear(year);

    }


}
