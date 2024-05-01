package com.harsh.properties.inheritance;

// final can be used to prevent inheritance
// Methods will also be final as well if the class is final
public class Box {

    double h;
    double w;
    double l;

    Box(){

        // Every class has {@code Object} as a superclass.
        super();

        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    Box(double h, double w, double l){
        this.h = h;
        this.w = w;
        this.l = l;
    }

    public Box(Box other){
        this.h = other.h;
        this.w = other.w;
        this.l = other.l;
    }

    public void information(){
        System.out.println("This is Box class.");
    }
}
