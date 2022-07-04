package softUni;

import java.util.Scanner;

public class MovieProfit {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        String film= scan.nextLine ( );
        int days=Integer.parseInt ( scan.nextLine ( ) );
        int tickets=Integer.parseInt ( scan.nextLine ( ) );
        double price=Double.parseDouble ( scan.nextLine ( ) );
        int pr=Integer.parseInt ( scan.nextLine ( ) );
        double sumTickets=(tickets*price)*days;

        System.out.printf ("The profit from the movie %s is %.2f lv.",film,sumTickets-((sumTickets*pr)/100) );



    }
}
