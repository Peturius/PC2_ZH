import java.util.ArrayList;

public class Matrix {
    private static final int MATRIX_LENGTH = 5;
    public static void main(String[] args) {

        //int matrix[][] = new int[MATRIX_LENGTH][MATRIX_LENGTH];
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -60,   2, -88,  30},
                { 90, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                {  0,   0,   0,   0,   0}
        };
        System.out.println(sumOfNumbersDivisibleByFive(matrix));
        indexOfRowsWithZeros(matrix);
    }
        public static int sumOfNumbersDivisibleByFive(int matrix[][]) {
            int sum = 0;
            for (int i = 0; i < MATRIX_LENGTH; i++) {
                for (int j = 0; j < MATRIX_LENGTH; j++) {
                    if (matrix[i][j] % 5 == 0) {
                        sum += matrix[i][j];
                    }
                }
            }
            return sum;
        }

        public static ArrayList<Integer> indexOfRowsWithZeros(int matrix[][]) {
            ArrayList<Integer> indexes = new ArrayList<>();
            boolean csakNulla = true;
            for (int i = 0; i < MATRIX_LENGTH; i++) {
                for (int j = 0; j < MATRIX_LENGTH; j++) {
                    if (matrix[i][j] != 0) {
                        csakNulla = false;
                    }
                }
                if (csakNulla == true) {
                    indexes.add(i);
                    System.out.println(i);
                }
                csakNulla = true;
            }
            return indexes;
        }
}
