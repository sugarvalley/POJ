package PJATK.LAB05.TASK03;

public class Tesla extends Car {
    public Tesla(String color) {
        super(color, "Tesla");
    }

    private void electric() {
        System.out.println("Let's go, I'm electric");
    }
}
