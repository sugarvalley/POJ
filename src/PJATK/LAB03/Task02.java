package PJATK.LAB03;

public class Task02 {
    public static void main(String[] args) {
        Punkt punkt = new Punkt(2,5);
        Punkt punkt2 = new Punkt(5, 9);
        System.out.println(punkt.obliczOdleglosc(5,9));
        System.out.println(punkt.obliczOdleglosc(new Punkt(5,9)));
    }
}
