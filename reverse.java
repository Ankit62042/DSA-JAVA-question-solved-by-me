package com.ankit;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {

    public static void reverse(int[] arr){

        int first=0;
        int last=arr.length-1;

        while(last>first) {

            int temp=arr[last];

            arr[last]=arr[first];

            arr[first]=temp;

            first++;
            last--;



        }

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the size of array");

        int x=input.nextInt();

        System.out.println("Enter element in the array");

        int[] arr=new int[x];

        for (int i = 0; i <arr.length; i++) {
            System.out.println("arr["+i+"]");

            arr[i]=input.nextInt();
        }

        System.out.println("Original Array");



        System.out.println(Arrays.toString(arr));


        System.out.println("Reverse Array");

        reverse(arr);



    }



}
