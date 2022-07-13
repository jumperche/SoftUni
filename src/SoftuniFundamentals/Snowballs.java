package SoftuniFundamentals;

import java.util.*;

public class Snowballs {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );

        double max=0;
        int s=0;
        int t=0;
        int q=0;
        for ( int i = 0 ; i < n ; i++ ) {
            int snow = Integer.parseInt ( scanner.nextLine ( ) );
            int time = Integer.parseInt ( scanner.nextLine ( ) );
            int quality = Integer.parseInt ( scanner.nextLine ( ) );

            double value=  Math.pow ( (snow/time),quality );
            if (max<value){
                max=value;
                s=snow;
                t=time;
                q=quality;
            }

        }
        System.out.printf ("%d : %d = %.0f (%d)",s,t,max,q );
    }
}
