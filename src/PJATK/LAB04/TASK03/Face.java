package PJATK.LAB04.TASK03;

public enum Face {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King"),
    ACE("Ace");

    private String face;

    public String getFace() {
        return face;
    }

    private Face(String face) {
        this.face = face;
    }
}
