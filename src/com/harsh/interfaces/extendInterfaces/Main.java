package com.harsh.interfaces.extendInterfaces;

// Have to implement methods of both classes
public class Main implements B{

    // Access modifier should be better than that in the parent interface/class
    @Override
    public void greet(){
        System.out.println("Greetings");
    }

    @Override
    public void start(){
        System.out.println("Starts");
    }

    public static void main(String[] args) {

        Main obj = new Main();

        A.staticFn();
        obj.greet();
        obj.start();
    }
}
