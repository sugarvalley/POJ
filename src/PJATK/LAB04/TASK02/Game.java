package PJATK.LAB04.TASK02;

import java.util.Random;

public class Game {
    int first;
    int last;
    int randomnum;
    Random random = new Random();

    public Game(int first, int last) {
        this.first = first;
        this.last = last;
        this.randomnum = random.nextInt((last - first) + 1) + first;
    }

    public boolean ifGuessed(int guess) {
        if (randomnum == guess) {
            return true;
        } else if (guess > randomnum) {
            System.out.println("Too big");
            return false;
        } else {
            System.out.println("Too small");
            return false;
        }
    }

    public int getRandomnum() {
        return randomnum;
    }
}
