package PJATK.LAB03.TASK07;

import java.util.Scanner;

public class CashMachine {
    Scanner scanner = new Scanner(System.in);
    boolean exit;
    int choice;
    int amount;
    Account account;

    public CashMachine(Account account) {
        this.account = account;
        this.exit = true;
        while (exit) {
            System.out.println("-c-a-s-h---m-a-c-h-i-n-e-");
            System.out.println("|       main menu       |");
            System.out.println("| 1 |   check balance   |");
            System.out.println("| 2 |   withdraw money  |");
            System.out.println("| 3 |   deposit money   |");
            System.out.println("| 4 |   exit            |");
            System.out.println("-------------------------");
            this.choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("-c-a-s-h---m-a-c-h-i-n-e-");
                    System.out.println("|                       |");
                    System.out.println("|      your balance     |");
                    System.out.println("|          is           |");
                    System.out.println("|          " + account.checkBalance() + "           |");
                    System.out.println("|                       |");
                    System.out.println("-------------------------");
                    break;
                case 2:
                    System.out.println("-c-a-s-h---m-a-c-h-i-n-e-");
                    System.out.println("|                       |");
                    System.out.println("|     please insert     |");
                    System.out.println("|       amount to       |");
                    System.out.println("|       withdraw        |");
                    System.out.println("|                       |");
                    System.out.println("-------------------------");
                    this.amount = scanner.nextInt();
                    account.withdraw(amount);
                    break;
                case 3:
                    System.out.println("-c-a-s-h---m-a-c-h-i-n-e-");
                    System.out.println("|                       |");
                    System.out.println("|     please insert     |");
                    System.out.println("|       amount to       |");
                    System.out.println("|        deposit        |");
                    System.out.println("|                       |");
                    System.out.println("-------------------------");
                    this.amount = scanner.nextInt();
                    account.deposit(amount);
                    break;
                case 4:
                    this.exit = false;
                    continue;
            }
        }
    }
}
