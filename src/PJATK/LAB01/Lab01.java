package PJATK.LAB01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab01 {

    public static void main(String[] args) {

//        Z 1

        System.out.println(((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5));


//        Z 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert value in Celsius");
        double celsius = scanner.nextDouble();
        double fahrenheit = ((9.0 / 5) * celsius) + 32;
        System.out.println("Your value in Fahrenheit == " + fahrenheit);


//        Z 3

        double km = 1.609;
        System.out.println("Miles\t\tKilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t\t\t" + km * i);
        }


//        Z 4

        System.out.println("How many students do you want to add?");
        int x = scanner.nextInt();
        String name = "";
        int points = 0;
        for (int i = 1; i <= x; i++) {
            System.out.println("Insert name for student " + i);
            String name_tmp = scanner.next();
            System.out.println("Insert points for student " + i);
            int points_tmp = scanner.nextInt();
            if (points_tmp > points) {
                name = name_tmp;
                points = points_tmp;
            }
        }
        System.out.println("The best student is " + name + " with " + points + " points");


//        Z 5

        System.out.println("Insert 3 values for triangle");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }


//        Z 6

        System.out.println("Insert value from 1 to 7");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }


//        Z 7

        System.out.println("Insert 2 letters");
        char first = scanner.next().charAt(0);
        char second = scanner.next().charAt(0);
        if (first > second) {
            System.out.println(first);
        } else if (first == second) {
            System.out.println("They are the same");
        } else {
            System.out.println(second);
        }


//        Z 8

        System.out.println("Insert 3 integer values");
        int numbers[] = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Sorted values:");
        for (int i = 2; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }


//        Z 9

        System.out.println("\nInsert x and y values for the first point");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Insert x and y values for the second point");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double result = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        System.out.println("Line between points is equal to: " + result);


//        Z 10

        System.out.println("Choose: rock - 0, paper - 1, scissors - 2");
        int choice = scanner.nextInt();
        Random random = new Random();
        int num = random.nextInt(3);
        System.out.println("My choice is " + num);
        if (choice == 0 && num == 2 || choice == 1 && num == 0 || choice == 2 && num == 1) {
            System.out.println("You won");
        } else if (choice == num) {
            System.out.println("Draw");
        } else {
            System.out.println("You lost");
        }

    }
}
