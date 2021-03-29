package PJATK.LAB03.TASK07;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[10];
        CashMachine cashmachine;
        int id;
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i);
        }
        while (true) {
            System.out.println("Insert ID: ");
            id = scanner.nextInt();
            for (Account account : accounts) {
                if (account.id == id) {
                    System.out.println("ID          " + account.id);
                    System.out.println("balance     " + account.checkBalance());
                    cashmachine = new CashMachine(account);
                }
            }
        }
    }
}
