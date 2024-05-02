package com.harsh.accessControl;

import java.util.Objects;

public class ObjectDemo {

    Integer num;

    public ObjectDemo(int num){
        this.num = num;
    }

    // Returns the string representation
    @Override
    public String toString() {
        return super.toString();
    }

    // Runs when the object of a class is garbage collected
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // Gives a unique number representation of an object
    @Override
    public int hashCode() {
        return this.num.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(this.num, ((ObjectDemo) obj).num);
    }

    @Override
    protected java.lang.Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        Object obj1 = new ObjectDemo(34);
        Object obj2 = new ObjectDemo(34);

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
    }
}
