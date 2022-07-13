package SoftuniFundamentals;

import java.util.*;

public class DayOfWeek {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        String[] day={"Invalid day","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println (day[n] );

    }

}
