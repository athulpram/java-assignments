package com.step.assignments;

public class Rectangle {
    private double width=0;
    private double length=0;


    public Rectangle(double width, double length) {
        if(width>=0) {
            this.width = width;
        }
        if(length>=0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return this.length*this.width;
    }
}
