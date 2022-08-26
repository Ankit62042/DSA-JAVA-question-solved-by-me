package com.ankit;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {

    public static void runningSum(int[] sums){

        int sum=0;

        int[] result=new int[sums.length];


        for (int i = 0; i <sums.length ; i++) {

            sum=sum+sums[i];

            result[i]=sum;


        }

        System.out.println(Arrays.toString(result));
       }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Size of Array");

        int x=input.nextInt();

        int[] arr=new int[x];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextInt();

        }


        runningSum(arr);


    }



}
