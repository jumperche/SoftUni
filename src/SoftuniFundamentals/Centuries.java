package SoftuniFundamentals;

import java.util.*;

public class Centuries {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        double years=n*100;
        double days=years*365.2422;
        double hours=days*24;
        double min=hours*60;
        System.out.printf ( "%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",n,years,days,hours,min );

    }
}
