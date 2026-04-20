package Chapter1Array.TwoDArrays;

public class TransposeMatrix_2 {

        public static int[][] MatrixSum(int[][] matrix){
            int n = matrix.length;
            int m = matrix[0].length;

            int[][] result = new int[m][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[j][i] = matrix[i][j];
                }
            }

            return result;
        }

        public static void printMatrix(int[][] matrix){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int matrix[][] = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            int[][] result = MatrixSum(matrix);
            printMatrix(result);
        }
    }

