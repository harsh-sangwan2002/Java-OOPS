package com.harsh.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Collection {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(v);
        System.out.println(list);
    }
}
