package com.step.assignments.jwellery;

public class Jewellery {
    private String name;
    private double value;
    private int size;

    public Jewellery(String name, double value, int size) {
        this.name = name;
        this.size = size;
        if(this.size<1) this.size=1;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public int getSize(){
        return size;
    }
}
