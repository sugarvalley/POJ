package PJATK.LAB05.TASK02;

public class Shop {
    protected String address;
    protected int size;

    public Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    protected String getInformation() {
        return String.format("ADDRESS: %s, SIZE: %d", address, size);
    }
}
