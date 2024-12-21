package com.harsh.packages.staticExample;

public class StaticBlock {

    static int a;
    static int b;

    // This is a static block and will only run once
    static{
        a = 5;
        b = a*4;
        System.out.println("I am a static block.");
    }

    public static void main(String[] args) {

        StaticBlock sb = new StaticBlock();

        // Cannot create static block inside a function
        // Can only be created inside a class
//        static{
//
//        }
    }
}
