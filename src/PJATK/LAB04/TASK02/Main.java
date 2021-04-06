package PJATK.LAB04.TASK02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range");
        System.out.println("LOWEST:     ");
        int first = scanner.nextInt();
        System.out.println("HIGHEST:    ");
        int last = scanner.nextInt();
        Game number = new Game(first, last);
        boolean guessed = false;
        int choice;
        for (int i = 0; i < 5; i++) {
            System.out.println("Make a guess:");
            choice = scanner.nextInt();
            guessed = number.ifGuessed(choice);
            if (guessed) {
                System.out.println("You won! The number was: " + number.getRandomnum());
                break;
            }
        }
        if (!guessed) {
            System.out.println("You lost! The number was: " + number.getRandomnum());
        }
    }
}
