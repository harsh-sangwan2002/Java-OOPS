package com.harsh.accessControl.pkg1;

public class A {

    // Cannot access num directly outside class A
    // Private data can only be accessed within the same class
    private int num;

    // Can be accessed anywhere - inside package, outside package, ...
    public String str;

    // Can be accessed within same package and subclass in another package
    protected int[] arr;

    // Can be accessed only within the same package
    boolean flag;

    public A() {

    }

    public A(int num, String str, boolean flag){
        this.num = num;
        this.str = str;
        this.arr = new int[num];
        this.flag = flag;
    }

    // We can't access the num variable directly but getters can be used to get the value.
    public int getNum(){
        return this.num;
    }
}