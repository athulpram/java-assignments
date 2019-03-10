package com.step.assignments.arrays;

import java.util.Scanner;

public class MinElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the count of numbers : ");
        int count = scanner.nextInt();

        System.out.println("Enter "+count+" numbers....");
        int[] numbers = readIntegers(count);

        System.out.print("the minimum number you entered is : " + findmin(numbers));
    }

    public static int[] readIntegers(int numberCount){
        int[] numbers = new int[numberCount];
        for(int count=0;count<numberCount;count++) {
            numbers[count] = scanner.nextInt();
        }
        return numbers;
    }

    public static int findmin(int[] numbers){
        int minValue = numbers[0];
        for (int index = 0; index < numbers.length; index++) {
            if(numbers[index] < minValue ){
                minValue = numbers[index];
            }
        }

        return minValue;
    }
}
