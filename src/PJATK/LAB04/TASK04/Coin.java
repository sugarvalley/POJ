package PJATK.LAB04.TASK04;

import java.util.Random;

public class Coin {
    private boolean isHeads;
    private Random random;

    public Coin() {
        this.random = new Random(100);
    }

    public boolean isHeads() {
        return isHeads;
    }

    public void tossCoin() {
        this.isHeads = random.nextBoolean();
    }
}
