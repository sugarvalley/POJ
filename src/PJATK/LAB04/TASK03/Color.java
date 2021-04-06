package PJATK.LAB04.TASK03;

public enum Color {
    CLUBS("♣"),
    DIAMONDS("♦"),
    HEARTS("♥"),
    SPADES("♠");

    private String color;

    public String getColor() {
        return color;
    }

    private Color(String color) {
        this.color = color;
    }
}
