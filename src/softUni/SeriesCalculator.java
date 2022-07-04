package softUni;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String film= scanner.nextLine ( );
        int seson=Integer.parseInt ( scanner.nextLine ( ) );
        int epi=Integer.parseInt ( scanner.nextLine ( ) );
        double time=Double.parseDouble ( scanner.nextLine ( ) );
        double werb=20*time/100;
        double timeWerb=time+werb;
        double sum=seson*timeWerb*epi+(seson*10);
        System.out.printf ( "Total time needed to watch the %s series is %.0f minutes.",film ,sum);



    }
}
