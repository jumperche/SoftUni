package SoftuniFundamentals;

import java.util.*;

public class VendingMaschine {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        String input = scanner.nextLine ( );
        double sum = 0;
        while ( !input.equals ( "Start" ) ) {
            double x = Double.parseDouble ( input );
            if ( !( x == 0.1 || x == 0.2 || x == 0.5 || x == 1.0 || x == 2.0 ) ) {
                System.out.printf ( "Cannot accept %.2f%n" , x );
            } else {

                sum = sum + x;
            }
            input = scanner.nextLine ( );
        }
        input = scanner.nextLine ( );
        while ( !input.equals ( "End" ) ) {
            switch (input) {
                case "Coke":

                    if ( sum-1 < 0 ) {
                        System.out.println ( "Sorry, not enough money" );

                        input = scanner.nextLine ( );
                        break;
                    } else {
                        System.out.println ( "Purchased " + input );
                        sum = sum - 1;
                        input = scanner.nextLine ( );
                        break;
                    }
                case "Soda":

                    if ( sum -0.8< 0 ) {
                        System.out.println ( "Sorry, not enough money" );

                        input = scanner.nextLine ( );
                        break;
                    } else {
                        System.out.println ( "Purchased " + input );
                        sum = sum - 0.8;
                        input = scanner.nextLine ( );
                        break;
                    }
                case "Crisps":

                    if ( sum -1.5< 0 ) {
                        System.out.println ( "Sorry, not enough money" );

                        input = scanner.nextLine ( );
                        break;
                    } else {
                        System.out.println ( "Purchased " + input );
                        sum = sum - 1.5;
                        input = scanner.nextLine ( );
                        break;
                    }
                case "Water":

                    if ( sum -0.7< 0 ) {
                        System.out.println ( "Sorry, not enough money" );

                        input = scanner.nextLine ( );
                        break;
                    } else {
                        System.out.println ( "Purchased " + input );
                        sum = sum - 0.7;
                        input = scanner.nextLine ( );
                        break;
                    }
                case "Nuts":

                    if ( sum-2< 0 ) {
                        System.out.println ( "Sorry, not enough money" );


                        input = scanner.nextLine ( );
                        break;
                    } else {
                        System.out.println ( "Purchased " + input );
                        sum = sum - 2.0;
                        input = scanner.nextLine ( );
                        break;
                    }
                default:
                    System.out.println ("Invalid product" );
                    input= scanner.nextLine ( );
            }
        }

            System.out.printf ( "Change: %.2f%n" ,  sum  );

    }
}
