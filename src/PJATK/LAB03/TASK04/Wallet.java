package PJATK.LAB03.TASK04;

public class Wallet {
    double amount;

    public Wallet(double amount) {
        this.amount = amount;
    }

    public double checkBalance() {
        return amount;
    }

    public void reduce(double amount) {
        this.amount -= amount;
    }
}
