package com.step.assignments;

public class Bike extends Vehicle {
    private int numberOfGears;
    private int gear;
    private int power;

    public Bike(int speed, int numberOfGears, int gear, int power) {
        super(2, speed);
        this.numberOfGears = numberOfGears;
        this.gear = gear;
        this.power = power;
    }

    public void changeGear(int gear){
        if(gear <= numberOfGears && gear > 0)
            this.gear = gear;
    }
}
