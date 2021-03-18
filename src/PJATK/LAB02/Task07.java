package PJATK.LAB02;

// sum of values in array > 0

public class Task07 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>0) {
            sum += array[i];
            }
        }
        return sum;
    }
}
