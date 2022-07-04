package softUni;

import java.util.Scanner;

public class MovineRating {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        int film=Integer.parseInt ( scan.nextLine ( ) );
        String name= "";
        double rating=0.0;
        double sum=0;
        double min=Double.POSITIVE_INFINITY;
        double max=0;
        String filmMin="";
        String filmMax="";
        for ( int i = 0 ; i < film ; i++ ) {
            name= scan.nextLine ( );
            rating=Double.parseDouble ( scan.nextLine ( ) );
            sum+=rating;
            if (rating<min){
                min=rating;
                filmMin=name;
            }
              if (rating>  max){
                    max=rating;
                    filmMax=name;
                }
            }


        System.out.printf ( "%s is with highest rating: %.1f%n",filmMax, max);
        System.out.printf ( "%s is with lowest rating: %.1f%n",filmMin, min);
        System.out.printf ( "Average rating: %.1f%n",sum/film);
    }
}
