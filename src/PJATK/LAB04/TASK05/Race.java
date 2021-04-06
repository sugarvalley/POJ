package PJATK.LAB04.TASK05;

public class Race {
    public static void main(String[] args) {
        Runner one = new Runner("Peter", 5, 10);
        Runner two = new Runner("Andrea", 2, 12);
        Runner three = new Runner("Adam", 6, 9);
        one.introduce();
        two.introduce();
        three.introduce();
        Runner winner = null;
        while (one.getDistance() < 50 && two.getDistance() < 50 && three.getDistance() < 50) {
            one.run();
            two.run();
            three.run();
        }
        if (one.getDistance() > two.getDistance() && one.getDistance() > three.getDistance()) {
            winner = one;
        } else if (two.getDistance() > one.getDistance() && two.getDistance() > three.getDistance()) {
            winner = two;
        } else {
            winner = three;
        }
        System.out.println("The winner is: " + winner.name);
    }
}
