package com.harsh.properties.inheritance;

public class Main {

    public static void main(String[] args) {

        Box box = new Box();
//        System.out.println(box.l);
//        System.out.println(box.w);
//        System.out.println(box.h);

        // Type of reference determines which members can be accessed
        Box b2 = new BoxWeight(1,2,3,4);
        System.out.println(b2.h);
        System.out.println(b2.w);
        System.out.println(b2.l);
        b2.information();

        // We have access to BoxWeight class variables
        // But we are calling constructor of Parent class, so how would we initialize the variables of BoxWeight class
//        BoxWeight b3 = new Box(1,2,3);


    }
}
