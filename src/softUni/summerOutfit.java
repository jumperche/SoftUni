package softUni;

import java.util.Scanner;

public class summerOutfit {
    public static void main ( String[] args ) {
        Scanner scanner= new Scanner ( System.in );
        int grad=Integer.parseInt ( scanner.nextLine ()  );
        String time= scanner.nextLine ();
        String outfit="";
        String shoes="";
        if (time.equals ( "Morning" )) {
            if ( grad >= 10 && grad <= 18 ) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if ( grad > 18 && grad <= 24 ) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if ( grad >= 25 ) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }
        if (time.equals ( "Afternoon" )) {
            if ( grad >= 10 && grad <= 18 ) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if ( grad > 18 && grad <= 24 ) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if ( grad >= 25 ) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        }
        if (time.equals ( "Evening" )) {
            if ( grad >= 10 && grad <= 18 ) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if ( grad > 18 && grad <= 24 ) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if ( grad >= 25 ) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf ("It's %d degrees, get your %s and %s.",grad,outfit,shoes);
    }
}
