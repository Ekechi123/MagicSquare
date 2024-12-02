public class MagicSquareTest {

    public static void main(String[] args) {
        // Test case 1: Matrix 1 (Magic Square)
        int[][] matrix1 = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };
        boolean result1 = MagicSquare.isMagicSquare(matrix1);
        if (result1) {
            System.out.println("Test 1 passed: Matrix 1 is a Magic Square.");
        } else {
            System.out.println("Test 1 failed: Matrix 1 should be a Magic Square.");
        }

        // Test case 2: Matrix 2 (Not a Magic Square)
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        boolean result2 = MagicSquare.isMagicSquare(matrix2);
        if (!result2) {
            System.out.println("Test 2 passed: Matrix 2 is not a Magic Square.");
        } else {
            System.out.println("Test 2 failed: Matrix 2 should not be a Magic Square.");
        }
    }
}

