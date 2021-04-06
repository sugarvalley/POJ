package PJATK.LAB04.TASK03;

public class Main {
    public static void main(String[] args) {
        Card card = new Card(Color.HEARTS, Face.QUEEN);
        System.out.println(card);
        Card[] deck = new Card[52];
        int i = 0;
        for (Face f: Face.values()) {
            for (Color c: Color.values()) {
                deck[i] = new Card(c, f);
                i++;
            }
        }
        for (Card d: deck) {
            System.out.println(d);
        }
    }
}
