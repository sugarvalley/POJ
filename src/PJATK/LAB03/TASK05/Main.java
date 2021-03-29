package PJATK.LAB03.TASK05;

public class Main {
    public static void main(String[] args) {
        MyCircle circle = new MyCircle(5.0);
        System.out.println("Diameter: " + circle.diameter());
        System.out.println("Circumference: " + circle.circumference());
        System.out.println("Field: " + circle.field());
    }
}
