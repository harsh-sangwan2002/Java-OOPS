package com.harsh.generics.comparison;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student karan = new Student(12,99.23F);
        Student rahul = new Student(21,98.23F);
        Student vinay = new Student(32,89.23F);
        Student harsh = new Student(42,91.23F);

        Student[] list = {karan,rahul,vinay,harsh};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
