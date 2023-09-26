package com.Jeeva;

public class FuncOverLoading {
    //Function overloading happens when two  or more fucntions with the same name occurs with different parameters
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }

    static int sum(int a ,  int b)
    {
        return a+ b ;
    }


    static int sum(int a , int b , int c){
        return a + b+ c ;
    }
    static void fun(String  name){
        System.out.println("Second one");
        System.out.println(name);
    }

    public static void main(String[] args) {
        fun(67);
     //   fun("Jeeva");
        int ans = sum(3 , 4 , 13);
        System.out.println(ans);
    }
}
