package PJATK.LAB05.TASK02;

public class Main {
    public static void main(String[] args) {
        String[] products1 = {"books", "magazines", "paper"};
        String[] products2 = {"bread", "water", "cake"};
        Bookshop bookshop = new Bookshop("Wallmart street 35", 300, products1);
        Bakery bakery = new Bakery("Nougat 1", 2, products2);
        System.out.println(bookshop.getInformation());
        System.out.println(bakery.getInformation());
    }
}
