package com.ankit;

import java.util.Scanner;

public class MultipleOfTen {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

           do{
               int sc=input.nextInt();

               if(sc%10==0){
               continue;
               }
               System.out.println(sc);
           }while(true);



    }


}
