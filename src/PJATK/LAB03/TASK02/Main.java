package PJATK.LAB03.TASK02;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2,5);
        System.out.println(point.calcDistance(5,9));
        System.out.println(point.calcDistance(new Point(5,9)));
    }
}
