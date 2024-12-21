package com.harsh.packages.staticExample;

public class Main {

    static void greeting(){
        System.out.println("Greeting");

        Main obj = new Main();
        obj.fun();

        // Cannot directly call the non-static method - greeting
//        fun();
    }

    void fun(){
        // Non-static method can access static data
        greeting();
    }

    // Java can access main method without creating the object of the class
    public static void main(String[] args) {

        Human harsh = new Human(21,"Harsh",92,false);
        Human random = new Human(21,"Random",92,true);

        System.out.println(Human.population);
        // A static method can only access static data/methods
        greeting();
    }
}
