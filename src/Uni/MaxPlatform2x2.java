package Uni;

public class MaxPlatform2x2 {
    public static void main(String[] args) {
// Declare and initialize the matrix
        int[][] matrix = {
                { 0, 2, 4, 0, 9, 5 },
                { 7, 1, 3, 3, 2, 1 },
                { 1, 3, 9, 8, 5, 6 },
                { 4, 6, 7, 9, 1, 0 }
        };
// Find the maximal sum platform of size 2 x 2
        int bestSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;
        for (int row = 0; row < matrix.length - 1; row++) {

            for (int col = 0; col < matrix[0].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > bestSum) {
                    bestSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
// Print the result
        System.out.println("The best platform is:");
        System.out.printf(" %d %d%n",
                matrix[bestRow][bestCol],
                matrix[bestRow][bestCol + 1]);
        System.out.printf(" %d %d%n",
                matrix[bestRow + 1][bestCol],
                matrix[bestRow + 1][bestCol + 1]);
        System.out.printf("The maximal sum is: %d%n", bestSum);
    }
}


