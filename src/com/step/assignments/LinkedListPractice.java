package com.step.assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int i =1;
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int num = iterator.next();
            System.out.println(num);
            if(num == 2){
                list.add(23);
            }
        }
    }
}
