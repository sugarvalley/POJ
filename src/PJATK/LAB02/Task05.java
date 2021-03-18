package PJATK.LAB02;

// sum of two arrays

public class Task05 {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3, 4, 5}, {1, 1, 1, 1, 1}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1, 1}};
        System.out.println(sum(array1, array2));
    }

    public static int sum(int[][] array1, int[][] array2) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                sum += array1[i][j];
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum += array2[i][j];
            }
        }
        return sum;
    }
}
