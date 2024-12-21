package com.harsh.cloning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{

        Human vinay = new Human(33,"Vinay");

        // It is much faster than creating copy using copy constructor
        Human harsh = (Human)vinay.clone();

        harsh.arr[0] = 100;
        System.out.println(Arrays.toString(vinay.arr));
    }
}
