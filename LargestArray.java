package com.ankit;


import java.util.Scanner;

public class LargestArray {


    public static int Largest(int arr[]){
        int largest=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>=largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Size of the Array");

        int size=input.nextInt();

        int[] arr=new int[size];

        System.out.println("enter Elements");

        for (int i = 0; i <arr.length ; i++) {

            System.out.print("arr["+i+"]: ");
            arr[i]=input.nextInt();


        }
        System.out.print("Largest Number in this Array is: "+Largest(arr));





    }
}
