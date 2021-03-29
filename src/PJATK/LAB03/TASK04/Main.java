package PJATK.LAB03.TASK04;


public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(10);
        VendingMachine machine = new VendingMachine(wallet);
        boolean keepBuying = true;
        while (wallet.checkBalance() != 0 && keepBuying) {
            keepBuying = machine.buyProcedure();
        }
    }
}
