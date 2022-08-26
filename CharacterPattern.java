package com.ankit;

import java.util.Scanner;

public class CharacterPattern {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        for (int i = 1; i <=n; i++) {
            char x='A';
            for (int j = 1; j <=i ; j++) {

                System.out.print(x+ " ");
                x++;
            }
            System.out.println();
        }




    }


}
