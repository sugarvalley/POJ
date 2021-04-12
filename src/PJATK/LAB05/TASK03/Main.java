package PJATK.LAB05.TASK03;

public class Main {
    public static void main(String[] args) {
        Pickup pickup = new Pickup("white", "chevy", 22);
        Ferrari ferrari = new Ferrari("yellow", "fzx");
        Tesla tesla = new Tesla("black");

        Car cars[] = new Car[]{
                pickup, ferrari, tesla
        };
        for (Car car : cars) {
            car.drive();
        }
    }
}
