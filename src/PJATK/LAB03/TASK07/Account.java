package PJATK.LAB03.TASK07;

public class Account {
    int id;
    int amount;

    public Account(int id) {
        this.id = id;
        this.amount = 100;
    }

    public int checkBalance() {
        return amount;
    }

    public void withdraw(int amount) {
        this.amount -= amount;
    }

    public void deposit(int amount) {
        this.amount += amount;
    }
}
