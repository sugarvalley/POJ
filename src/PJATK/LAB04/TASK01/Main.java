package PJATK.LAB04.TASK01;

public class Main {
    public static void main(String[] args) {
        Fraction half = new Fraction(1, 2);
        half.show();
        Fraction quarter = half.multiply(half);
        quarter.show();
        Fraction threeFourth = quarter.add(half);
        threeFourth.show();

        half.multiply(half).add(quarter).divide(half).show();
    }
}
