package com.step.assignments;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        Boolean validHourOfDay = hourOfDay >= 0 && hourOfDay <= 23;
        Boolean nightTime = hourOfDay < 8 || hourOfDay > 22;
        return barking && validHourOfDay && nightTime;
    }
}
