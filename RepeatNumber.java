package com.ankit;

import java.util.Scanner;

public class RepeatNumber {

       public static boolean Solve(int[] arr){

              boolean repeat=false;
           int x=0;
               int temp=arr[x];

              for (int i = 1; i <=arr.length ; i++) {
                     if(temp==arr[i]){
                            repeat= true;

                     }


              }

              temp=arr[x++];


           return repeat;

       }

       public static void main(String[] args) {

            Scanner input= new Scanner(System.in);

              System.out.println("Enter the Size of the Array");

              int x=input.nextInt();

              int[] arr=new int[x];

              System.out.println("Enter the elements");

              for (int i = 0; i <arr.length ; i++) {
                     arr[i]=input.nextInt();

              }

           System.out.println(Solve(arr));

       }

}
