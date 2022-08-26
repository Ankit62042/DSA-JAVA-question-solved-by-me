package com.ankit;

import java.util.Scanner;

public class HalfPyramid {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number of Star");
        int N=input.nextInt();

        for (int i = 1; i <N ; i++) {


            for (int j = 0; j < i; j++) {
                System.out.print(" *");

            }
            System.out.println();

        }
    }




}
