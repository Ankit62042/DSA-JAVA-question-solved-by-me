package com.ankit;

import java.util.Scanner;

public class Car {

    static int engine=1;
    static int stare=1;
    static int wheels=4;

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter A for Audi\n Enter B for Toyota\n Enter C for Tesla");

        char key=input.next().charAt(0);

        audi ob1=new audi();
        toyota ab2=new toyota();
        tesla ob3=new tesla();

        if(key=='A'){
         ob1.engine_audi();
         ob1.seat_audi();
         ob1.fuel_audi();

        }else if(key=='B'){
            ab2.engine_toyota();
            ab2.seat_toyota();
            ab2.fuel_toyota();
        }else if(key=='C'){
            ob3.engine_tesla();
            ob3.seat_tesla();
            ob3.fuel_tesla();
        }
    }


}
 class audi extends Car{

    static int seat=4;

    public static void engine_audi(){
        System.out.println("600hp");
    }

      public static void seat_audi(){
          System.out.println(seat);
      }


      public static void fuel_audi(){
          System.out.println("4lt/km");
      }




  }


class toyota extends Car{

    static int seat=4;

    public static void engine_toyota(){
        System.out.println("800hp");
    }

    public static void seat_toyota(){
        System.out.println(seat);
    }


    public static void fuel_toyota(){
        System.out.println("7lt/km");
    }


}


class tesla extends Car{

    static int seat=2;

    public static void engine_tesla(){
        System.out.println("1000hp");
    }

    public static void seat_tesla(){
        System.out.println(seat);
    }


    public static void fuel_tesla(){
        System.out.println("0lt/km");
    }


}


