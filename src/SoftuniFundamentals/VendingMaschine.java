package SoftuniFundamentals;
//Your task is to calculate the total purchase price from a vending machine. Until you receive "Start" you will be given different coins that are being inserted into the machine. You have to sum them to have the total money inserted. There is a problem though. Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins. If someone tries to insert some other coins, you have to display "Cannot accept {money}", where the value is formatted to the second digit after the decimal point and not add it to the total money. On the next few lines until you receive "End" you will be given products to purchase. Your machine has, however, only "Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively. If the person tries to purchase a not existing product, print "Invalid product". Be careful that the person may try to purchase a product for which he doesn't have money. In that case, print "Sorry, not enough money". If the person purchases a product successfully print "Purchased {product name}". After the "End" command, print the money that is left formatted to the second decimal point in the format "Change: {money left}".
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
