package PJATK.LAB02;

import java.util.Arrays;
import java.util.Scanner;

// sum of 2 arrays

// if array1.length != array2.length return empty array

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert length of arrays:");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        System.out.println("Insert values for first array");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Insert values for second array");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(sum_arrays(array1, array2)));
    }

    public static int[] sum_arrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            int sum[] = new int[0];
            return sum;
        } else {
            int sum[] = new int[array1.length];
            for (int i = 0; i < sum.length; i++) {
                sum[i] = array1[i] + array2[i];
            }
            return sum;
        }
    }
}
