package com.harsh.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdaFunctions {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<5; i++)
            list.add(i);

        // Consumer is an interface
        Consumer<Integer> fun = ele-> System.out.println(2*ele);
        list.forEach(fun);

        Operation sum = Integer::sum;
        Operation diff = (a,b)->a-b;
        Operation product = (a,b)->a*b;
        Operation divide = (a,b)->a/b;

        lambdaFunctions fn = new lambdaFunctions();
        System.out.println(fn.operate(4,3,sum));
    }

    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a, int b);
}