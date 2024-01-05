public class transpoz {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} };

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris:");
        printMatrix(matrix);

        System.out.println("Transpoz:");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
