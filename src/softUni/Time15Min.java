package softUni;

import java.util.Scanner;

public class Time15Min {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int x = Integer.parseInt ( scanner.nextLine () );
        int x1 = Integer.parseInt ( scanner.nextLine () );
        int sum=(x*60)+x1;
        sum=sum+15;
        int hour=sum/60;
        int min=sum%60;
        if (hour==24){
            hour=0;
        }
        if (min < 10) {
            System.out.printf ( "%d:0%d", hour,min );
        } else {
            System.out.printf ( "%d:%d", hour, min );}



        }
}
