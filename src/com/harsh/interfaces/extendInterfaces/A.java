package com.harsh.interfaces.extendInterfaces;

public interface A {

    // static methods should have a body inside the interface
    static void staticFn(){
        System.out.println("This is a static method.");
    }

    void start();
}
