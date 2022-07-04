package softUni;

import java.util.Scanner;

public class Barcode {
    public static void main ( String[] args ) {
        Scanner scanner=new Scanner ( System.in );
int start=Integer.parseInt ( scanner.nextLine ( ) );
        int end=Integer.parseInt ( scanner.nextLine ( ) );
        String ch = String.valueOf ( start );
        String ende=String.valueOf ( end );

        int x1=Integer.parseInt ( String.valueOf ( ch.charAt ( 0) ) );
        int x2=Integer.parseInt ( String.valueOf ( ch.charAt ( 1) ) );
        int x3=Integer.parseInt ( String.valueOf ( ch.charAt ( 2) ) );
        int x4=Integer.parseInt ( String.valueOf ( ch.charAt ( 3) ) );
        int y1=Integer.parseInt ( String.valueOf ( ende.charAt ( 0) ) );
        int y2=Integer.parseInt ( String.valueOf ( ende.charAt ( 1) ) );
        int y3=Integer.parseInt ( String.valueOf ( ende.charAt ( 2) ) );
        int y4=Integer.parseInt ( String.valueOf ( ende.charAt ( 3) ) );

        for ( int first = x1; first <=y1 ; first++ ) {

            for ( int second = x2; second <= y2 ; second++ ) {
                for ( int third = x3 ; third <= y3 ; third++ ) {
                    for ( int four = x4 ; four <= y4 ; four++ ) {
                        if ( first%2!=0&&second%2!=0&&third%2!=0&&four%2!=0) {
                            System.out.printf ( "%d%d%d%d " ,first, second , third , four );
                        }
                    }
                }
            }

        }



    }
}
