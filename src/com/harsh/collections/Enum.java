package com.harsh.collections;

public class Enum {

    // Inheritance is not possible in enums
    // However it can implement as many interfaces as it requires
    enum Week implements A{

        // These are enum constants
        // These are public, static and final
        // Since its final you can create child enums
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // this is not public or protected
        // If it is public/protected it will allow initialisation of more than 7 Objects for Week
        // We don't want to create new objects
        Week(){
            System.out.println("Constructor called");
        }

        @Override
        public void print() {
            System.out.println("Print method");
        }
    }

    public static void main(String[] args) {

        Week week = Week.Monday;
        System.out.println(week);

        for(Week day : Week.values())
            System.out.println(day);

        System.out.println(week.ordinal());
        week.print();
    }
}
