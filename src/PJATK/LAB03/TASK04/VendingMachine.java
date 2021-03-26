package PJATK.LAB03.TASK04;


import java.util.Scanner;

public class VendingMachine {
    Scanner scanner = new Scanner(System.in);
    Wallet wallet;
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
        this.wallet = wallet;

    }

    public boolean buyProcedure() {
        System.out.println("Hello, what do you want to buy?: ");
        System.out.println("1 | chocolate bar   | price 1.50");
        System.out.println("2 | coke can        | price 1.99");
        System.out.println("3 | potato chips    | price 3.50");
        System.out.println("0 | QUIT");
        System.out.println("Please select snack's number");
        int choice = scanner.nextInt();
        if (choice == 0) {
            return false;
        }
        buySnack(choice);
        System.out.println("Your wallet balance: " + wallet.checkBalance());
        return true;
    }

    protected void buySnack(int chosenSnack) {
        switch (chosenSnack) {
            case 1:
                if (canBuy(barsAmount, barsPrice)) {
                    wallet.reduce(barsPrice);
                    barsAmount -= 1;
                    System.out.println("You successfully bought chocolate bar");
                }
                break;
            case 2:
                if (canBuy(cansAmount, cansPrice)) {
                    wallet.reduce(cansPrice);
                    cansAmount -= 1;
                    System.out.println("You successfully bought a can of coke");
                }
                break;
            case 3:
                if (canBuy(chipsAmount, chipsPrice)) {
                    wallet.reduce(chipsPrice);
                    chipsAmount -= 1;
                    System.out.println("You successfully bought chips");
                }
                break;
            default:
                System.out.println("You picked the wrong number");
                break;
        }

    }

    private Boolean canBuy(int amount, double price) {
        if (amount - 1 >= 0 && wallet.checkBalance() - price >= 0) {
            return true;
        } else if (wallet.checkBalance() - price >= 0) {
            System.out.println("There's not enough of this product");
            return false;
        } else {
            System.out.println("You don't have enough money");
            return false;
        }

    }

}
