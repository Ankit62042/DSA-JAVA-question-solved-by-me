package com.ankit;

import java.util.Scanner;

public class BinarySearch {


       public static int Search(int key,int[] arr){

          int start=0;
          int end=arr.length-1;




          while(end>=start){
              int mid=(start+end)/2;

              if(arr[mid]==key){
                  System.out.println("Element is found ");
                  break;

              }else if(arr[mid]>key){
                  end=mid-1;

              }else if(arr[mid]<key){
                  start=mid+1;

              }


          }




           return -1;

    }


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int[] arr={4,5,8,15,45,200,400,452};

        System.out.println("Enter the key: ");

        int y=input.nextInt();


        Search(y,arr);





    }




}
