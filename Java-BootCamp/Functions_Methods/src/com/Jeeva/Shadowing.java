package com.Jeeva;

public class Shadowing {

    //Works only for class level variables
    static int x = 90; //This  will  be  shadowed at line 10 , because  the  lower level  will hide  the  upper level
    // Static int x = here you don't  have to create object to access it.

    public static void main(String[] args) {
        System.out.println(x);
        //int x = 40;
        //This will show error because the x value is not initialized , scope will begin when the value is  initialized
              //int x ;
              //System.out.println(x);
        x=40;
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
