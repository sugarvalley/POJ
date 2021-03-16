package PJATK.LAB02;

public class Task06 {
    public static void main(String[] args) {
        int a = 40;
        int b = 15;
        System.out.println(nwd(a, b));
    }

    public static int nwd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return nwd(b, a % b);
        }
    }
}
