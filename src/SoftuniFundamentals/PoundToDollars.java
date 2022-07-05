package SoftuniFundamentals;

import java.util.*;

public class PoundToDollars {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        double n =Double.parseDouble ( scanner.nextLine ( ) );
        double s=n*1.36;
        System.out.printf ("%.3f",s );

    }
}
