package com.Jeeva;

public class Swap {
    public void message()
    {
        System.out.println("Hello World");
    }

    static void changeName(String name){
        name = "Jeeva Anbarasu";
        System.out.println(name);
    }
    static void swap(int a , int b){
        int temp  = a ;
        a = b ;
        b = temp;
        //This  change  will only be valid  in this function scope only
        System.out.println(a + " " + b);
    }
    public static void message1()
    {
        System.out.println("Good Evening");
    }
    public static void main(String[] args) {

        int a = 10 ;
        int b = 20 ;

        swap(a ,b);

        String  name ="Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
    }
}
