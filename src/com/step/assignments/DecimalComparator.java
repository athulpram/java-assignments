package com.step.assignments;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(5.79,5.722));
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int newNum1 = (int) (num1 * 1000.0D);
        int newNum2 = (int) (num2 * 1000.0D);
        return newNum1 == newNum2;
    }
}
