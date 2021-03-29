package PJATK.LAB03.TASK05;

public class MyCircle {
    double radius;

    public MyCircle(double radius) {
        this.radius = radius;
    }

    public double diameter() {
        return radius * 2;
    }

    public double circumference() {
        return diameter() * Math.PI;
    }

    public double field() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
