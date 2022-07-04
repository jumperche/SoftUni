package softUni;

import java.util.Scanner;

public class AccountBalance {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ();


        double sum = 0;
        while ( !input.equals ( "NoMoreMoney" ) ) {

            double x1 = Double.parseDouble ( input );
            if ( x1 < 0 ) {
                System.out.println ( "Invalid operation!" );
                break;
            }

            sum = sum + x1;
            System.out.printf ( "Increase: %.2f%n ", x1 );
            input = scanner.nextLine ();
        }
        System.out.printf ( "Total: %.2f ", sum );
    }
}
