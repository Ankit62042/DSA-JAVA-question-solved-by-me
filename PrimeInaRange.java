package com.ankit;


import java.util.Scanner;

public class PrimeInaRange {

    public static boolean isPrime(int n){

        boolean isPrime=true;

        for (int i = 2; i<=n-1 ; i++) {
            if(n%i==0){
                isPrime=false;
            }
        }

        return  isPrime;
    }

    public static void Prime(int r){
        for (int i = 1; i <=r; i++) {

            if(isPrime(i)){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Range");

        int range=input.nextInt();

        Prime(range);


    }


}
