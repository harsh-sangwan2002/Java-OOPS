package com.harsh.properties.inheritance;

// Single Inheritance
public class BoxWeight extends Box{

    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = weight;
    }

    public BoxWeight(double l, double w, double h, double weight){

        // Call to parent class constructor
        super(l,w,h);
        this.weight = weight;
    }

    public void boxInfo(){
        System.out.println("This is BoxWeight class");
    }
}
