package com.step.assignments;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double height, double height1) {
        super(width, height);
        this.height = height1;
        if(this.height<0) this.height=0;
    }

    public double getHeight() {
        return height;
    }

    public double getVoulme(){
        return getArea() * this.height;
    }
}
