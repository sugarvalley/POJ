package PJATK.LAB03.TASK06;

public class Windmill {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean on;
    int radius;
    String color;

    public Windmill() {
        this.speed = SLOW;
        this.on = true;
        this.radius = 20;
        this.color = "white";
    }

    public Windmill(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void info() {
        System.out.println(
                "Speed: " + this.speed
                + " Is ON?: " + this.on
                + " Radius: " + this.radius
                + " Color: " + this.color
        );
    }
}
