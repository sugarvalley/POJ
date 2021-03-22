package PJATK.LAB03;

public class Kwadrat {
    int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public int obliczPole() {
        return bok * bok;
    }

    public int obliczObwod() {
        return bok * 4;
    }
}
