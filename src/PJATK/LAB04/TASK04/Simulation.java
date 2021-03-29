package PJATK.LAB04.TASK04;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        System.out.println("Insert number of tries for simulation: ");
        Scanner scanner = new Scanner(System.in);
        int numTries = scanner.nextInt();
        int numHeads = 0;
        Coin coin = new Coin();
        for (int i=0; i<numTries; i++) {
            coin.tossCoin();
            if (coin.isHeads()) {
                numHeads++;
            }
        }
        System.out.println((100 * numHeads)/(double)numTries + "% of heads | "+ (100*(numTries-numHeads))/(double)numTries + "% of tails | after " + numTries + " tosses");
    }
}
