package PJATK.LAB02;


public class Task04 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {0, 0, 0, 0, 0}, {6, 7, 8, 9, 1}};
        show_array(array);
    }

    public static void show_array(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
