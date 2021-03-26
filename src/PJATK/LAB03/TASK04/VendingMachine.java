package PJATK.LAB03.TASK04;

import PJATK.LAB03.TASK03.Wallet;

import java.util.Scanner;

public class VendingMachine {
    Scanner scanner = new Scanner(System.in);
    Wallet wallet;
    int choice;
    boolean exit;
    int barsAmount;
    double barsPrice;
    int cansAmount;
    double cansPrice;
    int chipsAmount;
    double chipsPrice;

    public VendingMachine(Wallet wallet) {
        this.barsAmount = 5;
        this.barsPrice = 1.50;
        this.cansAmount = 10;
        this.cansPrice = 1.99;
        this.chipsAmount = 3;
        this.chipsPrice = 3.50;
        System.out.println("Hello, what do you want to buy?: ");
        System.out.println("1 | chocolate bar   | price 1.50");
        System.out.println("2 | coke can        | price 1.99");
        System.out.println("3 | potato chips    | price 3.50");
        System.out.println("Please select snack's number");
        this.choice = scanner.nextInt();
        switch (choice) {
            case 1:

        }

    }

    public void buySnack() {

    }

}
