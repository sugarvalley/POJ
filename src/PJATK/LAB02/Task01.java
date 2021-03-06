package PJATK.LAB02;

import java.util.Arrays;
import java.util.Scanner;

// Make array - ask user about size and values, then print the array

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert array length");
        int size = scanner.nextInt();
        make_array(size);
    }

    public static void make_array(int size) {
        Scanner scanner = new Scanner(System.in);
        char[] array = new char[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Insert value " + (i + 1));
            array[i] = scanner.next().charAt(0);
        }
        System.out.println(Arrays.toString(array));
    }
}
