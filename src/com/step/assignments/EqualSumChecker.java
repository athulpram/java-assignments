package com.step.assignments;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(5,8,13));
    }
    public static boolean hasEqualSum(int value1,int value2,int value3){
        return value1+value2 == value3;
    }
}
