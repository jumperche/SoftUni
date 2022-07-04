package Uni;

public class Temperatur {
    public static int[][] MultiTable = new int[ 13 ][ 32 ];
    public static int minArray=Integer.MAX_VALUE;
    public static int maxArray=Integer.MIN_VALUE;
    //int MulTable[][]=new int[12][31];
    public static void main ( String[] args ) {

        int min = 1;
        int max = 1;
        generate ( min , max );


    }

    public static void generate ( int min , int max ) {
        for ( int i = 1 ; i <= 12 ; i++ ) {
            if ( i >10 || i<4 ) {
                min = -20;
                max = 10;
            } else {
                min = 5;
                max = 25;
            }
            System.out.print ( "Month: " + i + "   " );
            for ( int j = 1 ; j <= 31 ; j++ ) {
                if ( i == 2 && j >= 29 ) {
                    MultiTable[ i ][ j ] = -200;
                    System.out.print ( MultiTable[ i ][ j ] + " " );
                    continue;
                } else if ( i > 8 && i % 2 == 1 && j == 31 ) {
                    MultiTable[ i ][ j ] = -200;
                    System.out.print ( MultiTable[ i ][ j ] + " " );
                    continue;
                } else if ( i % 2 == 0 && j == 31 && i < 8 ) {
                    MultiTable[ i ][ j ] = -200;
                    System.out.print ( MultiTable[ i ][ j ] + " " );
                } else {

                    int x = (int) ( Math.random ( ) * ( max - min + 1 ) + min );
                    MultiTable[ i ][ j ] = x;
                    System.out.print ( MultiTable[ i ][ j ] + " " );
                    /*if (minArray>MultiTable[i][j]){
                        minArray=MultiTable[i][j];
                    }
                    else if (maxArray<MultiTable[i][j]){
                        maxArray=MultiTable[i][j];
                    }*/
                }
            }
            System.out.println ( );

        }

    }
}
