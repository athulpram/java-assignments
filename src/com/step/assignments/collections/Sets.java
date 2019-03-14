package com.step.assignments.collections;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<String> setOfStrings = new HashSet<String>();
//        setOfStrings.addAll(new ArrayList<String>("fadsfd","dsafsdf","sdafsdf"));
        setOfStrings.add("jdaoifjds");
        setOfStrings.add("dfhagiudsjf");
        setOfStrings.add("aiodfhodsi");

        Set<String> anotherSetOfStrings = new HashSet<String>();
        anotherSetOfStrings.add("jdaoifjds");
        anotherSetOfStrings.add("dsdfadsffhagiudsjf");
        anotherSetOfStrings.add("aiodfhofdsafdsi");

//        System.out.println("union is "+union(setOfStrings,anotherSetOfStrings));
    }
//
//    public static Set<T> union(Set<T> set1, Set<T> set2){
//        System.out.println(set1+""+set2);
//        Iterator iterator = set1.iterator();
//        while(iterator.hasNext()){
//            String value = (String) iterator.next();
//            if(!set2.contains(value)){
//                set1.add(value);
//            }
//        }
//        return set1;
//    }

}
