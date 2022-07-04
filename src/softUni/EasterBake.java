package softUni;

import java.util.Scanner;

public class EasterBake {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        int broi = Integer.parseInt ( scanner.nextLine ( ) );
        int maxFl = 0;
        int maxSu = 0;
        double sugarSum = 0;
        double flourSum = 0;


        for ( int i = 0 ; i < broi ; i++ ) {
            int sugar = Integer.parseInt ( scanner.nextLine ( ) );
            int flour = Integer.parseInt ( scanner.nextLine ( ) );
            sugarSum = sugarSum + sugar;
            flourSum = flourSum + flour;
            if ( sugar > maxSu ) {
                maxSu = sugar;
            }
            if ( flour > maxFl ) {
                maxFl = flour;
            }
        }

        double pakFl = Math.ceil ( flourSum / 750);
        double pakSu = Math.ceil ( sugarSum / 950) ;
        System.out.printf ( "Sugar: %.0f%n" , pakSu );
        System.out.printf ( "Flour: %.0f%n" , pakFl );
        System.out.printf ( "Max used flour is %d grams, max used sugar is %d grams." , maxFl , maxSu );

    }
}
