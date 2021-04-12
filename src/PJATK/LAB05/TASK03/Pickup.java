package PJATK.LAB05.TASK03;

public class Pickup extends Car {
    private final int wheelSize;

    public Pickup(String color, String brand, int wheelSize) {
        super(color, brand);
        this.wheelSize = wheelSize;
    }
}
