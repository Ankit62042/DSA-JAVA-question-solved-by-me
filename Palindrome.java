package com.ankit;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int x){

        int sum=0;

        int temp=x;
        boolean answer=false;
        while(x>0){
            int r=x%10;
            sum=sum*10+r;
            x=x/10;

        }

        if(sum==temp){
            answer=true;
        }
        return answer;


    }

    public static void range(int range){
        for (int i = 1; i < range; i++) {

            if (isPalindrome(i)){
                System.out.print(i+" ");





            }

        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the range: ");

        int number=input.nextInt();



       range(number);
    }

}
