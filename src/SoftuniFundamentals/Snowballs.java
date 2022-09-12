package SoftuniFundamentals;
//Tony and Andi love playing in the snow and having snowball fights, but they always argue about which makes the best snowballs. They have decided to involve you in their fray by making you write a program that calculates snowball data and outputs the best snowball value.
//You will receive N – an integer, the number of snowballs being made by Tony and Andi.
//For each snowball, you will receive 3 input lines:
//•	On the first line, you will get the snowballSnow – an integer.
//•	On the second line, you will get the snowballTime – an integer.
//•	On the third line, you will get the snowballQuality – an integer.
//For each snowball, you must calculate its snowballValue by the following formula:
//(snowballSnow / snowballTime) ^ snowballQuality
//In the end, you must print the highest calculated snowballValue.
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
