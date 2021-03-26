package PJATK.LAB03.TASK03;

public class Wallet {
    double amount;

    public Wallet(double amount) {
        this.amount = amount;
    }

    public double checkBalance() {
        return amount;
    }

    public void buy(double amount) {
        this.amount -= amount;
    }
}
