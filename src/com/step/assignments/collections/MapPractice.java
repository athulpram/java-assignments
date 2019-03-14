package com.step.assignments.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapPractice {
    public static void main(String[] args) {
        Map<String,Long> contacts = new HashMap<>();

        contacts.put("Athul", 7023750329L);
        contacts.put("Arnab",1233456778L);
        contacts.put("Puli", 9876543210L);
        contacts.put("zxsdg", 9876542353210L);

        for(Map.Entry<String,Long> entry: contacts.entrySet()){
            System.out.println();
        }
    }
}
