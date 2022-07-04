package softUni;

import java.util.Scanner;

public class Cinema {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ();
        int rows = Integer.parseInt ( scanner.nextLine () );
        int col = Integer.parseInt ( scanner.nextLine () );
double income=0.00;
if ("Premiere".equals ( name )){
    income=rows*col*12;
} else if ("Normal".equals ( name )) {
    income=rows*col*7.5;
    } else if ("Discount".equals ( name )) {
    income=rows*col*5;
}
        System.out.printf ( "%.2f leva",income );
    }
}
