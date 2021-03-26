package PJATK.LAB03.TASK01;

public class Square {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public int calcArea() {
        return side * side;
    }

    public int calcLength() { return side * 4; }
}
