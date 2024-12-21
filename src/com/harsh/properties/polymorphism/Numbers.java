package com.harsh.properties.polymorphism;

public class Numbers {

    // Compile-time polymorphism
    // Also called as early binding
    double sum(double a, int b){
        return a+b;
    }

    // Method signature needs to be different
    final void sum(int a, int b){
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {

        Numbers n = new Numbers();

        System.out.println(n.sum(2.0,3));
    }
}
