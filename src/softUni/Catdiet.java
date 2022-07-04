package softUni;

import java.util.Scanner;

public class Catdiet {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int mas = Integer.parseInt ( scanner.nextLine ( ) );
        int protein = Integer.parseInt ( scanner.nextLine ( ) );
        int wug = Integer.parseInt ( scanner.nextLine ( ) );
        int kalorii = Integer.parseInt ( scanner.nextLine ( ) );
        int water = Integer.parseInt ( scanner.nextLine ( ) );
        double sumMas=((mas*kalorii)/100.00)/9;
        double sumProtein=((protein*kalorii)/100.00)/4;
        double sumWug=((wug*kalorii)/100.00)/4;
        double sum=sumMas+sumProtein+sumWug;
        double gram=kalorii/sum;
        double kal=((100-water)/100.00)*gram;
        System.out.printf ( "%.4f",kal );

    }
}