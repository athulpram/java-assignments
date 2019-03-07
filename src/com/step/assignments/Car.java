package com.step.assignments;

public class Car extends Vehicle {
    private int gear;
    private int numberOfSeats;

    public Car(int speed,int gear,int numberOfSeats) {
        super(4, speed);
        this.gear = gear;
        this.numberOfSeats = numberOfSeats;
    }

    public void changeGear(int gear){
        if(gear>0 && gear<=5)
        this.gear = gear;
    }

    public void changeDirection(){}
}
