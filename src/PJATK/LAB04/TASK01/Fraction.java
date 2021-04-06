package PJATK.LAB04.TASK01;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        for (int i = Math.min(numerator, denominator); i > 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        if (numerator >= denominator) {
            int whole = numerator / denominator;
            int rest = numerator % denominator;
            return String.format("%d and %d/%d", whole, rest, denominator);
        } else {
            return String.format("%d/%d", numerator, denominator);
        }
    }

    public void show() {
        System.out.println(this);
    }

    public Fraction multiply(Fraction fraction) {
        int numerator = this.numerator * fraction.numerator;
        int denominator = this.denominator * fraction.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction divide(Fraction fraction) {
        int numerator = this.numerator * fraction.denominator;
        int denominator = this.denominator * fraction.numerator;
        return new Fraction(numerator, denominator);
    }

    public Fraction add(Fraction fraction) {
        int numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        int denominator = this.denominator * fraction.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction subtract(Fraction fraction) {
        int numerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        int denominator = this.denominator * fraction.denominator;
        return new Fraction(numerator, denominator);
    }
}
