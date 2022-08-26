package com.ankit;




public class PrimeOrNot {

    /*public static boolean isPrime(int n){

        boolean isPrime=true;

        for (int i = 2; i < n-1; i++) {

            if(n%i==0){
                isPrime=false;
            }

        }

         return isPrime;






}*/

      public static void main(String[] args) {

          int n=6,flag=0;

          for (int i = 2; i <n/2 ; i++) {

              if(n%i==0){

                  flag=1;
              }

          }

          if(flag==1){
              System.out.println("Number is not a Prime Number");
          }else{
              System.out.println("Number is prime");
          }


      }
    }

