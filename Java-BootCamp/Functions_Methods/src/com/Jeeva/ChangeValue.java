package com.Jeeva;

import java.util.Arrays;

public class ChangeValue {

    public static void main(String[] args) {
        //create an array - collections of intergers, numbers etc....
        int arr[] = {1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

        int sum[] = arr;
        sum[0]=300;
        System.out.println(Arrays.toString(arr));
    }
    //Here the original value of arr[] is changed because  it is non-primitive or
    //objects and related stuffs.
    //In primitives value is passed
    //In non primitives is  passed by the copy of  the value  of the reference
    //the reference is  passed by  call by value
    static  void change(int[] num){
        num[0] = 100;
        num[5]= 101;
    }
}
