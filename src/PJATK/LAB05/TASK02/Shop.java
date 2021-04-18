package PJATK.LAB05.TASK02;

public class Shop {
    String address;
    int size;

    public Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    public String getInformation() {
        return String.format("ADDRESS: %s, SIZE: %d", address, size);
    }
}
