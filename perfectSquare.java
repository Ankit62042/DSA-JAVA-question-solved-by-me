package com.ankit;

import java.util.Scanner;

public class perfectSquare{


    static boolean isPerfect(int x){
        int sum=0;

        int y=0;
        boolean result=false;

        while(x>0){

            int r=x%10;
            sum=sum+r;

            x=x/10;



        }

        if(sum<10){
            if(sum==1 || sum==4 || sum==7 || sum==9){

                result=true;




            }
        }else if(sum>=10){
            while(sum>0){
                int rem=sum%10;
                y=y+rem;
                sum=sum/10;

            }
            if(sum==1 || sum==4 || sum==7 || sum==9){
                result=true;


            }
        }


        return result;


    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number: ");

        int number=input.nextInt();


        System.out.println(  isPerfect(number));




    }



}
