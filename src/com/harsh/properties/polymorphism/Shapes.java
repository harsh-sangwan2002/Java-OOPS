package com.harsh.properties.polymorphism;

public class Shapes {

    // final can be used for performance enhancements
    // Since the compiler doesn't have to resolve which method to resolve
    // final can be used to prevent overriding
    void area(){
        System.out.println("I am in shapes class.");
    }

    static void staticFn(){
        System.out.println("I am Shapes Class method.");
    }
}
