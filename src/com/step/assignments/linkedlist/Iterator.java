package com.step.assignments.linkedlist;

import java.util.List;
import java.util.NoSuchElementException;

public class Iterator {
    private List list;
    private int currentIndex;


    public Iterator(List list) {
        this.list = list;
        this.currentIndex = -1;
    }

    public boolean hasNext(){
        return (currentIndex+1) < (list.size());
    }

    public Integer next(){
        currentIndex++;
        try {
            return (Integer) list.get(currentIndex);
        }catch (Exception e){
            throw new NoSuchElementException();
        }
    }
}
