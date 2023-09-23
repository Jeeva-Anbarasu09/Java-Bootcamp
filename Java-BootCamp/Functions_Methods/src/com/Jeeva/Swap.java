package com.Jeeva;

public class Swap {
    public void message()
    {
        System.out.println("Hello World");
    }

    public static void message1()
    {
        System.out.println("Good Evening");
    }
    public static void main(String[] args) {

        int a = 10 ;
        int b =20 ;

        int temp = a;
        a = b;
        b = temp ;

        System.out.println(a + " " + b);
    }
}
