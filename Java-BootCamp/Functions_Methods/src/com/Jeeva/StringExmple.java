package com.Jeeva;

import java.util.Scanner;

public class StringExmple {

    public static String greet()
    {
        String greeting = "How are you ?" ;
        return greeting;
    }
    public static void main(String[] args) {

//        String message = greet();
//        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = sc.nextLine();

        String personalized = mygreet(name);
        System.out.println(personalized);
    }

    public static String mygreet(String name) {
        String message = "Hello " + name ;
        return message;
    }
}
