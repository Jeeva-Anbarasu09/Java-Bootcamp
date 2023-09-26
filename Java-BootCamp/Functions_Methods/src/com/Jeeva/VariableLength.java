package com.Jeeva;

import java.util.Arrays;

public class VariableLength {

    //VARIABLE  LENGTH ARGUMENTS is  used when  you don't know how many arguments are used

    public static void main(String[] args) {

        fun(1,3,45,4,32,6,0,2432); //more than 0 arguments.

        demo(1);
        demo("kunal" ,"Jeeva");

    }

    //mix of  arguments
    //when you use  multiple  arguments ... the var leng agrs must be used  at last
    static  void multiple(int a, int b, String ...v){

    }

    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }

    static  void demo(int a ){
        System.out.println(a);
    }
    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){ //internally array of integers
        System.out.println(Arrays.toString(v));
    }
}
