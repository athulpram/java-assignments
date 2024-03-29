package com.step.assignments;

public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(-1,-2,-4);
        printEqual(2,2,2);
        printEqual(2,2,3);
        printEqual(2,3,4);
    }
    public static void printEqual(int a, int b, int c){
        if (a < 0 || b<0 || c<0){
            System.out.println("Invalid Value");
            return;
        }
        if (a==b && b==c){
            System.out.println("All numbers are equal");
            return;
        }
        if ( a == b || b==c || a==c){
            System.out.println("Neither all are equal or different");
            return;
        }
        System.out.println("All numbers are different");
        return;
    }
}
