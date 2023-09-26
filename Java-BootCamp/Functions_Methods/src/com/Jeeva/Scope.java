package com.Jeeva;

public class Scope {

    //--------------------< SCOPING >---------------------
    // 1. functional scope
    // 2. Block Scope
    // 3. Loop scope
    //ANYTHING THAT IS INITAILIZED INSIDE  THE  BLOCK CANNOT BE USED OUTSIDE THE BLOCK
    //ANYTHING  THAT  IS  INITIALIZED OUTSIDE THE BLOCK CAN BE USED INSIDE THE BLOCK


    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;
        String name = "kunal" ;
        System.out.println(name);

        {
            a = 78; //reassign the original ref vaariable with someother value
            // int  a = 78 already initialised outside the block cannot be initialised again
            int  c = 99;
            //anything that is declared it in the block cannot be accessed outside
            //cannot create a  new  variable as same which is decalred  outside  the block,
            //but you can change the  value
            name = "raghul";
            System.out.println(name);
        }
        int c = 100; //anything that  is initialized  inside  the  block cannot be accessed outside  the block
        //so,  the one initialized inside can be initialized outside also
        System.out.println(c);
        System.out.println(name);
        System.out.println(a);
        //System.out.println(c); // cannot use outside the block

        //SCOPING IN FOR LOOP
        for (int i = 0 ; i < 4 ; i++){
            int num =20;
            // int a =10 ; already it  is initialized .
        }

    }

    static void random(){
        int num = 67 ; //function scope
        System.out.println(num);
    }
}
