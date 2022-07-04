package Uni;

import java.io.BufferedReader;
import java.io.IOException;

public class MatrixHelper {
    private MatrixHelper() {
    }
    public static void printIntMatrix ( int[][] matrix ) {
        for ( int[] row : matrix ) {
            for ( int col : row ) {
                System.out.print ( col + " " );
            }

            System.out.println ( );
        }
    }

    public static int[][] readIntMatrix ( int rowsCount , int colsCount , BufferedReader reader ) throws IOException {
        int[][] matrix = new int[rowsCount][colsCount];

        for ( int i = 0; i < rowsCount; i++ ) {
            java.lang.String[] row = reader.readLine ( ).split ( " " );

            for ( int j = 0; j < colsCount; j++ ) {
                matrix[i][j] = Integer.parseInt ( row[j] );
            }
        }

        return matrix;
    }
}
