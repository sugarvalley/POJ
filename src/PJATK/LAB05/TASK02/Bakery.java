package PJATK.LAB05.TASK02;

import java.util.Arrays;

public class Bakery extends Shop {
    private String[] products;

    public Bakery(String address, int size, String[] products) {
        super(address, size);
        this.products = products;
    }

    @Override
    public String getInformation() {
        return super.getInformation() + ", PRODUCTS: " + Arrays.toString(products);
    }
}
