package com.harsh.properties.polymorphism;

public class Triangle extends Shapes {

    @Override
    void area(){
        System.out.println("0.5*l*h");
    }

    static void staticFn(){
        System.out.println("I am Triangle Class method.");
    }
}
