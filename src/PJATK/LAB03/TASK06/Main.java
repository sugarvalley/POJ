package PJATK.LAB03.TASK06;

public class Main {
    public static void main(String[] args) {
        Windmill windmill1 = new Windmill();
        Windmill windmill2 = new Windmill(3, false, 30, "red");
        windmill1.info();
        windmill2.info();
    }
}
