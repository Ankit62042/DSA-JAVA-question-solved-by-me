package com.ankit;

import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number");
        int Number=input.nextInt();
        int flag=0;

        int m=Number/2;

        for (int i = 2; i <m ; i++) {

            if(Number==1 || Number==0){

                System.out.println("Number is not Prime");
            }else{
                if(Number%i==0){
                    System.out.println("Number is not Prime");
                    flag=1;
                    break;
                }
            }

        }



        if(flag==0){

            System.out.println("Number is Prime");
        }


    }



}
