package com.ankit;

import java.util.Scanner;

public class BinomialCoefficient {


    public static int fact(int n){

        int f=1;

        for (int i = 1; i <=n ; i++) {

            f=f*i;


        }

        return f;

    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Value of N");

        int n=input.nextInt();

        System.out.println("Enter the Value of r");

        int r=input.nextInt();

        int result=fact(n)/(fact(r)*fact(n-r));

        System.out.println("Result: "+result);




    }


}
