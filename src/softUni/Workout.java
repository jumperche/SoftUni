package softUni;

import java.util.Scanner;

public class Workout {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int day = Integer.parseInt ( scanner.nextLine ( ) );
        double km = Double.parseDouble ( scanner.nextLine ( ) );
        double sum = km;
        double x = 0;
        double all=km;
        for ( int i = 1 ; i <= day ; i++ ) {
            double pr = Double.parseDouble ( scanner.nextLine ( ) );
            x = sum * pr/100.00;
            sum += x;
            all+=sum;
        }

if (all>=1000){
    System.out.printf ( "You've done a great job running %.0f more kilometers!", Math.ceil ( all-1000) );
}
else {
    System.out.printf ( "Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil (  1000-all) );
}
    }
}
