package com.step.assignments.arrays.sort;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("sorted array is  ");
        printArray(sortArray(numbers));
    }
    public static int[] sortArray(int[] numbers){
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
