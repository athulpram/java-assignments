package com.step.assignments;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("area of rectangle of width 5 height 6 : "+ area(5,6));
        System.out.println("area of circle of radius 5 :"+ area(5));
    }
    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        return Math.PI*radius*radius;
    }
    public static double area(double x, double y){
        if(x<0||y<0){
            return -1;
        }
        return x*y;
    }
}