package softUni;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        String budget = sc.nextLine ( );
        String trans = sc.nextLine ( );
        int count = 1;
        int sum = 0;
        boolean cash = false;
        boolean card = false;
        double sumC=0;
        double sumCard=0;
        int transaction;
        boolean sold=false;
        int countCash=0;
        int counteCard=0;
        while ( !"End".equals ( trans ) ) {
            int bu=Integer.parseInt ( budget );
            transaction = Integer.parseInt ( trans );
            if ( count % 2 == 0 ) {
                card = true;

            } else {
                cash = true;
            }

            if ( transaction < 10 && card ) {
                System.out.println ( "Error in transaction!" );
                card=false;
            }

         else if ( transaction > 100&&cash ) {
            System.out.println ( "Error in transaction!" );
            cash=false;
        }
else {
                System.out.println ( "Product sold!" );
                sum+=transaction;
                sold=true;
            }
if (sold&&card){
    sumCard+=transaction;
    counteCard++;
}
else if (sold&&cash){
    sumC+=transaction;
    countCash++;
}

if (bu<=sum){
    System.out.printf ("Average CS: %.2f%n",sumC /countCash);
    System.out.printf ("Average CS: %.2f%n",sumCard /counteCard);
}
card=false;
cash=false;
sold=false;
count++;
        trans = sc.nextLine ( );
    }
        System.out.println ("Failed to collect required money for charity." );
    }
}
