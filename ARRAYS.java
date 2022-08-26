package com.ankit;

import java.util.Scanner;

public class ARRAYS {


    static int Pairs(int k, int[] arr){


        int count=0;


        for (int i = 0; i <arr.length ; i++) {

            int Start=arr[i];

            for (int j = 1; j <arr.length ; j++) {


                if(Start-arr[j]==k){
                    count++;
                }

            }



        }

        return k;
    }



    public static void main(String[] args) {





        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Number of Elements in an Array");

        int n=input.nextInt();

        int[] Arr=new int[n];

        for (int i = 0; i < n; i++) {
            Arr[i]=input.nextInt();

        }

        System.out.println("Enter the key: ");
        int Key=input.nextInt();




        System.out.println(Pairs(Key,Arr));

    }


}
