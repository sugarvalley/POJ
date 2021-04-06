package PJATK.LAB04.TASK03;

public class Card {

    private Color color;
    private Face face;

    public Card(Color color, Face face) {
        this.color = color;
        this.face = face;
    }

    @Override
    public String toString() {
        return face.getFace() + " of " + color.getColor();
    }
}
