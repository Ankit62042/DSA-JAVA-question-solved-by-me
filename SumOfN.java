package com.ankit;

import java.util.Scanner;

public class SumOfN {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the n  ");
        int n=sc.nextInt();
        int counter=0;
        int sum=0;
        while(counter<=n){

            sum=sum+counter;

            counter++;


        }

        System.out.println("Sum of "  + n +  " numbers is: " + sum);
    }


}
