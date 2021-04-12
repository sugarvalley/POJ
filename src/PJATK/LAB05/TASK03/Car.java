package PJATK.LAB05.TASK03;

public class Car {
    protected String color;
    protected String brand;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public void drive() {
        System.out.println("I'm driving " + color + " " + brand);
    }
}
