package PJATK.LAB05.TASK06;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(2));
        System.out.println(calculator.calculate(2, 4));
        System.out.println(calculator.calculate(2, 4, 6));
    }
}
