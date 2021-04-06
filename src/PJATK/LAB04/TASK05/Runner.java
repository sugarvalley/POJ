package PJATK.LAB04.TASK05;

import java.util.Random;

public class Runner {
    String name;
    int distance;
    int maxspeed;
    int minspeed;
    Random random = new Random();

    public Runner(String name, int minspeed, int maxspeed) {
        this.name = name;
        this.minspeed = minspeed;
        this.maxspeed = maxspeed;
        this.distance = 0;
    }

    public void introduce() {
        System.out.println("Im " + name + " and my running speed is " + minspeed + "-" + maxspeed + "km/h");
    }

    public void run() {
        int distancetemp;
        distancetemp = random.nextInt((maxspeed - minspeed) + 1) + minspeed;
        distance += distancetemp;
        System.out.println(name + " is at " + distance + "km!");
    }

    public int getDistance() {
        return distance;
    }
}
