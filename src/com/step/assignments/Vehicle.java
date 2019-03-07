package com.step.assignments;

public class Vehicle {
    private int numberOfWheels;
    private int speed;

    public Vehicle(int numberOfWheels, int speed) {
        this.numberOfWheels = numberOfWheels;
        this.speed = speed;
    }

    public void increaseSpeed(){
        this.speed++;
    }

    public void decreaseSpeed(){
        this.speed--;
    }
}
