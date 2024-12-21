package com.harsh.cloning;

public class Human implements Cloneable{

    int age;
    String name;
    int[] arr;

    Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};
    }

    @Override
    public Object clone() throws CloneNotSupportedException{

        // This is shallow copy
//        return super.clone();

        // This is deep copy
        Human twin = (Human)super.clone();

        twin.arr = new int[twin.arr.length];

        System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);

        return twin;
    }
}
