package com.ankit;

import java.util.*;


public class LinearSearch {


    public static void Search(int arr[],int key){

         int flag=0;


        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]==key){
                System.out.println("Element found at position "+(i +1));
                flag++;
            }

        }

        if(flag==0){
            System.out.println("Element is Not present in this array");
        }


    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the Size of Array");
          int size=input.nextInt();

          int[] arr=new int[size];

        System.out.println("Enter elements");

        for (int i = 0; i <arr.length ; i++) {
            System.out.print("arr["+i+"]: ");
            arr[i]=input.nextInt();

        }

        System.out.println("Enter the number you want to search in this array");

        int number=input.nextInt();

        Search(arr,number);



    }

}
