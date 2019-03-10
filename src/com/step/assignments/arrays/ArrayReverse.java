package com.step.assignments.arrays;

import java.util.Scanner;

import static com.step.assignments.arrays.MinElement.readIntegers;
import static com.step.assignments.arrays.sort.ArraySort.printArray;

public class ArrayReverse {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count;
        System.out.println("Enter the number of elements in array : ");
        count  = scanner.nextInt();

        System.out.println("Enter "+count+" numbers....");
        int[] numbers = readIntegers(count);

        System.out.println("Array before reverse : ");
        printArray(numbers);

        reverseArray(numbers);

        System.out.println("Array after reverse");
        printArray(numbers);
    }

    private static void reverseArray(int[] numbers) {
        for (int index = 0; index < numbers.length/2; index++) {
            int temp = numbers[index];
            numbers[index] = numbers[numbers.length-(index+1)];
            numbers[numbers.length-(index+1)] = temp;
        }
    }
}
