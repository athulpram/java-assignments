package com.step.assignments.Library;

public class Reader {
    private String name;


    public Reader(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{ Name : "+this.name+"}";
    }
}
