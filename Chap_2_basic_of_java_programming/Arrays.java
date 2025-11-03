package Chap_2_basic_of_java_programming;

public class Arrays {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = i * j;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int element = matrix[i][j];
                System.out.printf("%d\t", element);
            }
            System.out.println();
            System.out.println();
        }
    }
}
