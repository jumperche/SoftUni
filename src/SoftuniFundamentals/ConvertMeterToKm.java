package SoftuniFundamentals;

import java.util.*;

public class ConvertMeterToKm {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        double n =Double.parseDouble ( scanner.nextLine ( ) );
        double s=n/1000;
        System.out.printf ("%.2f",s );
    }
}
