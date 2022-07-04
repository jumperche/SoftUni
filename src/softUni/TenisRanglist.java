package softUni;

import java.util.Scanner;

public class TenisRanglist {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );
        int turnee = Integer.parseInt ( scanner.nextLine () );
        int point = Integer.parseInt ( scanner.nextLine () );
        int sumTurnee = 0;

        double win = 0;

        for ( int i = 1; i <= turnee; i++ ) {
            String rang = scanner.nextLine ();
            switch (rang) {
                case "W":
                    win++;
                    sumTurnee = sumTurnee + 2000;
                    break;
                case "F":
                    sumTurnee = sumTurnee + 1200;
                    break;
                case "SF":
                    sumTurnee = sumTurnee + 720;
                    break;
            }
        }
        System.out.println ( "Final points: "+(sumTurnee+point ));
int av = sumTurnee / turnee;
        System.out.printf ( "Average points: %.0f%n",Math.floor(av ));
        double pr=(win/turnee)*100;
        System.out.printf ( "%.2f%%",pr );
    }
}