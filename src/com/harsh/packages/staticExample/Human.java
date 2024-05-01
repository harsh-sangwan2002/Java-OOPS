package com.harsh.packages.staticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;

    // static variable is common to all the objects
    // without using the objects of the class we can still use it using className
    // static variables and methods belong to the class
    static int population;

    Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
    }

    // Can only access static data/methods
    static void message(){
        System.out.println(population);
    }
}
