package SoftuniFundamentals;

import java.util.*;

public class BackIn30Minutes {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int hour = Integer.parseInt ( scanner.nextLine ( ) );
        int minutes = Integer.parseInt ( scanner.nextLine ( ) );
        int sum=hour*60+minutes+30;
        hour=sum/60;
        minutes=sum%60;
        if (hour>23){
            hour=hour-24;
        }
        System.out.printf ("%d:%02d",hour,minutes );
    }
}
