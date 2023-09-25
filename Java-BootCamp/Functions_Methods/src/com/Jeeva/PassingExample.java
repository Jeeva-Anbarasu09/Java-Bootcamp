package com.Jeeva;

public class PassingExample {

    //PASS BY VALUE
    static void greet(String naam){
        int num = 10 ;
        //No one outside the greet scope can  access the num
        System.out.println(naam);
    }
    public static void main(String[] args) {
        String name = "Kunal  Kushwaha";
        greet(name);
        System.out.println(name);
        String chacha ="Iron Man";
        greet(chacha);
        System.out.println(chacha);
    }
}
