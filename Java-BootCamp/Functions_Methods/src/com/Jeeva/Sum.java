package com.Jeeva;

import java.util.Scanner;

public class Sum {

    //pass the value of the numbers will you call the method
    // Answer : Parameters

    static int sum3(int a , int b)
    {
       int sum = a+ b ;
       return sum ;
    }
    public static int sum2(){
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();
        sum = num1 + num2 ;
        return sum;
    }

    public static void sum()
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();
        sum = num1 + num2 ;
        System.out.println("The sum = " + sum);
    }
    /*
    Access modifier , return type , name ()
    {
    BODY
    return ;
    }
     */
    public static void main(String[] args) {

//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20,30);
        System.out.println(ans);
    }
}
