package softUni;

import java.util.Scanner;

public class Combinations {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int a = Integer.parseInt ( scanner.nextLine ( ) );
        int counter = 0;
        for ( int x = 0; x <= a; x++ ) {
            for ( int y = 0; y <= a; y++ ) {
                for ( int z = 0; z <= a; z++ ) {
                    if ( x + y + z == a ) {
                        counter++;
                    }
                }
            }
        }
        System.out.println ( counter );
    }
}
