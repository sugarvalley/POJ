package PJATK.LAB02;

import java.util.Scanner;
import java.util.Arrays;

// Arrays - ask for the size, ask for first value, then:

//  > add next values to the array - start from first value, next values have to be even

//  > return the lowest value

//  > return the highest value

//  > return sum of the elements

//  > return average

//  > return median

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert array length");
        int size = scanner.nextInt();
        System.out.println("Insert value for first element");
        int first = scanner.nextInt();
        int[] array = new int[size];
        array[0] = first++;
        if (first % 2 != 0) {
            first++;
        }
        for (int i = 1; i < array.length; i++) {
            array[i] = first;
            first += 2;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Min: " + lowest_element(array));
        System.out.println("Max: " + highest_element(array));
        System.out.println("Sum: " + sum(array));
        System.out.println("Average: " + average(array));
        System.out.println("Median: " + median(array));
    }

    public static int lowest_element(int[] array) {
        int lowest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }
        return lowest;
    }

    public static int highest_element(int[] array) {
        int highest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        return highest;
    }

    public static int sum(int[] array) {
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            value = value + array[i];
        }
        return value;
    }

    public static double average(int[] array) {
        double sum = sum(array);
        double value = sum / array.length;
        return value;
    }

    public static double median(int[] array) {
        int length = array.length / 2;
        double value = 0;
        if (array.length % 2 != 0) {
            value = array[length];
        } else {
            value = (array[(length - 1)] + array[length]) / 2;
        }
        return value;
    }
}
