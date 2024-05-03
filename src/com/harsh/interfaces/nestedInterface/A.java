package com.harsh.interfaces.nestedInterface;

public interface A {

    interface NestedInterface{

        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num){
        return (num&1)==1;
    }
}