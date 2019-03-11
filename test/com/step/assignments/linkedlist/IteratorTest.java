package com.step.assignments.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();
        Integer i = 0;
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);

        Iterator iterator = new Iterator(list);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}