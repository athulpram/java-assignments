package com.step.assignments.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SetFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);

        for (Integer l : list) {
            System.out.println(l);
        }
    }
}
