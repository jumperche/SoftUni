package SoftuniFundamentals;

import java.util.*;

public class TriplesOfLatinLetters {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        for ( int i = 0 ; i < n ; i++ ) {
            int ch=97+i;
            for ( int j = 0 ; j < n ; j++ ) {
                int cha=97+j;
                for ( int k = 0 ; k < n ; k++ ) {
                    int chars=97+k;
                    System.out.printf ("%c%c%c", (char)ch,(char)cha,(char)chars);
                    System.out.println ( );
                }



            }


        }
    }
}
