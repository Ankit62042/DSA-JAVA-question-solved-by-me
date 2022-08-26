package com.ankit;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

          System.out.println("Enter the Number of row");
        int r=input.nextInt();
          System.out.println("Enter the number of Column");
        int c=input.nextInt();

          int[][] arr=new int[r][c];

             // Taking the input of Elements of an array

            System.out.println("Taking the input of Elements of array");


        for (int i = 0; i < r; i++) {

            for (int j = 0; j <c ; j++) {
                arr[i][j]=input.nextInt();


            }

            // Printing the Matrix

            for ( i = 0; i < r; i++) {

                for (int j = i; j < c; j++) {
                    System.out.println(arr[i][j]+" ");

                }
                System.out.println();

            }

        }




    }


}
