package com.harsh.abstractDemo;

// Cannot have final keyword in abstract classes
abstract public class Parent {

    int age;

    public Parent(int age){
        this.age = age;
    }

    abstract void career();
    abstract void partner();

    // Cannot create abstract static or constructors

    // static methods can be created in abstract classes
    static void hello(){
        System.out.println("Parent says hello");
    }

    // can create normal methods in abstract classes
    void normal(){
        System.out.println("This is a parent normal method.");
    }
}
