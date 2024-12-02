public class MagicSquare {

    // Static method to check if a given 2D matrix is a magic square
    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int sumDiagonal1 = 0, sumDiagonal2 = 0;

        // Calculate the sum of the first diagonal (top-left to bottom-right)
        for (int i = 0; i < n; i++) {
            sumDiagonal1 += matrix[i][i];
            sumDiagonal2 += matrix[i][n - 1 - i];
        }

        // If diagonals' sums are not equal, it's not a magic square
        if (sumDiagonal1 != sumDiagonal2) {
            return false;
        }

        // Check each row sum
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != sumDiagonal1) {
                return false; // If any row sum is not equal to diagonal sum, not a magic square
            }
        }

        // Check each column sum
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != sumDiagonal1) {
                return false; // If any column sum is not equal to diagonal sum, not a magic square
            }
        }

        // If all checks pass, it is a magic square
        return true;
    }

    // Test the method with some sample data
    public static void main(String[] args) {
        int[][] matrix1 = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matrix 1 is a Magic Square: " + isMagicSquare(matrix1));
        System.out.println("Matrix 2 is a Magic Square: " + isMagicSquare(matrix2));
    }
}

